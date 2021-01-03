package com.learning.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther:yinzhen
 * @Date:2020/12/25 23:26
 * @Description:com.learning.demo
 * @version: 1.0
 */
public class SingleThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i=0;i<20;i++){
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }
}
