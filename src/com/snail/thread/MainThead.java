package com.snail.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Uesr : MacSzh2013
 * Date : 14-3-30
 * Time : 下午4:46
 * Description :
 */
public class MainThead {
    public static void main(String[] args) {
//        LiftOff liftOff = new LiftOff();
//        liftOff.run();
//        for (int i = 0 ; i < 5 ; i ++){
//            Thread thread = new Thread(new LiftOff());
//            thread.start();
//
//        }

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 0 ; i < 5 ;  i ++){
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
