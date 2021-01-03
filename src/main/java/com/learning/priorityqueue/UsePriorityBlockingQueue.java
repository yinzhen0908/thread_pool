package com.learning.priorityqueue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Auther:yinzhen
 * @Date:2021/1/2 16:43
 * @Description:com.learning.priorityqueue
 * @version: 1.0
 */
public class UsePriorityBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Task> priorityBlockingQueue = new PriorityBlockingQueue<>();
        Task t1 = new Task(3, "id为3");
        Task t2 = new Task(4, "id为4");
        Task t3 = new Task(1, "id为1");

        priorityBlockingQueue.add(t1);
        priorityBlockingQueue.add(t2);
        priorityBlockingQueue.add(t3);

        System.out.println("容器：" + priorityBlockingQueue);
        System.out.println(priorityBlockingQueue.take().getId());
        System.out.println("容器：" + priorityBlockingQueue);
    }
}
