package com.learning.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * @Auther:yinzhen
 * @Date:2021/1/2 14:28
 * @Description:com.learning.blockingqueue
 * @version: 1.0
 */
public class Consumer implements Runnable {

    private BlockingQueue<Integer> blockingQueue;

    public Consumer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("取出来的元素是："+blockingQueue.take());
            } catch (InterruptedException e) {
                System.out.println("消费者在等待新产品的时候被打断了！");
                e.printStackTrace();
            }
        }
    }
}
