package com.learning.demo;

/**
 * @Auther:yinzhen
 * @Date:2020/12/25 15:20
 * @Description:com.learning.demo
 * @version: 1.0
 */
public class Task implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}
