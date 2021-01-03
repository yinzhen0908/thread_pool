package com.learning.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * @Auther:yinzhen
 * @Date:2021/1/2 14:19
 * @Description:com.learning.blockingqueue
 * @version: 1.0
 */
public class Producer implements Runnable {

    private BlockingQueue<Integer> blockingQueue;
    private static int elemet = 0;

    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (elemet < 20){
            try {
                System.out.println("将要放进去的元素是："+elemet);
                blockingQueue.put(elemet++);
            } catch (InterruptedException e) {
                System.out.println("生产者在等待空闲时间的时候被打断了！");
                e.printStackTrace();
            }
        }
        System.out.println("生产者已经终止了生产过程！");

    }
}
