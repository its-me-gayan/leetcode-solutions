package org.example.thread;

import java.util.List;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 4/10/24
 * Time: 11:47 AM
 */
public class State {
   private Integer targetN;
   private Integer currentVal = 0;
   private Integer nextVal = 0;

    public Integer getTargetN() {
        return targetN;
    }

    public void setTargetN(Integer targetN) {
        this.targetN = targetN;
    }

    public Integer getCurrentVal() {
        return currentVal;
    }

    public void setCurrentVal(Integer currentVal) {
        this.currentVal = currentVal;
    }

    public Integer getNextVal() {
        return nextVal;
    }

    public void setNextVal(Integer nextVal) {
        this.nextVal = nextVal;
    }
}
