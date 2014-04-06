package com.snail.thread;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Uesr : MacSzh2013
 * Date : 2014/4/6
 * Time : 22:16
 * Description :程序入口  测试完成任务时返回值 不要忘记使用executorService.submit调用
 */
public class CallableDemo{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> arrayList = new ArrayList<Future<String>>();
        for (int i = 0 ; i < 8 ; i ++){
            arrayList.add(executorService.submit(new TaskWithResult(i)));
        }

        for (Future<String> future : arrayList){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                executorService.shutdown();
            }
        }

    }
}
