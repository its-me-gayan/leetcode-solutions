package org.example.thread;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 4/10/24
 * Time: 11:40 AM
 */
public class PrintOddEvenUsing2Thread {
    public static void main(String[] args) {
        State state = new State();
        state.setTargetN(100);

        new Thread(new PrinterEVEN(state)).start();
        new Thread(new PrinterODD(state)).start();
    }
}
