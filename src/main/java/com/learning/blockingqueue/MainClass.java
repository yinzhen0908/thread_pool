package com.learning.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Auther:yinzhen
 * @Date:2021/1/2 14:15
 * @Description:com.learning.blockingqueue
 * @version: 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        //ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(3, true);
        LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<Integer>(3);
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
