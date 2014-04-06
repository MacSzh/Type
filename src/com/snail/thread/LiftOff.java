package com.snail.thread;

/**
 * Uesr : MacSzh2013
 * Date : 14-3-30
 * Time : 下午4:39
 * Description :a task
 */
public class LiftOff implements Runnable {
    protected int coutDown = 9;
    private static int taskCount = 0;
    public static final int id = taskCount ++;

    public LiftOff(){

    }
    public LiftOff(int coutDown) {
        this.coutDown = coutDown;
    }

    private  String status (){
        return "#" + id + "(" + (coutDown > 0 ? coutDown : "Liftoff !" ) + "), " ;
    }

    @Override
    public void run() {
        while (coutDown-- > 0){
            System.err.print(status());
            Thread.yield();
        }
    }
}
