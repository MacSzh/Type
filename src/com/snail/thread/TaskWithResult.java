package com.snail.thread;


import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Uesr : MacSzh2013
 * Date : 2014/4/6
 * Time : 22:06
 * Description :当客户端程序员需要得知task完成时返回一个值的时候就需要实现Callable接口
 */
 public class TaskWithResult implements Callable<String> {
    private int id ;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {

        return "result of TaskWithResult " + id;
    }
}



