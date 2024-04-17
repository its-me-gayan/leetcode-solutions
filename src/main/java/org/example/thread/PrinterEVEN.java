package org.example.thread;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 4/10/24
 * Time: 11:47 AM
 */
public class PrinterEVEN implements Runnable {

    private State state;

    public State getState() {
        return state;
    }

    public PrinterEVEN(State state) {
        this.state = state;
    }

    @Override
    public void run() {

        synchronized (getState()) {

            while (state.getTargetN() >= state.getCurrentVal()) {
                try{
                    Thread.sleep(1000);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                try {
                    if (state.getCurrentVal() % 2 == 0) {
                        System.out.println("Im EVEN Thread "+Thread.currentThread().getName()+" - " + state.getCurrentVal());
                        state.setCurrentVal(state.getCurrentVal() + 1);
                        state.notifyAll();
                    } else {
                        state.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
