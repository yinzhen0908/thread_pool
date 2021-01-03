package com.learning.demo.fockjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * ClassName:ForkJoinPoolAction <br/>
 * Function: 使用ForkJoinPool完成一个任务的分段执行
 * 简单的打印0-300的数值。用多线程实现并行执行
 * Date:     2017年12月4日 下午2:26:55 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see      
 */
public class ForkJoinPoolAction {
    
    public static void main(String[] args) throws Exception{
        PrintTask task = new PrintTask(0, 300000);
        //创建实例，并执行分割任务
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(task);
         //线程阻塞，等待所有任务完成
        pool.awaitTermination(2, TimeUnit.SECONDS);
        pool.shutdown();
    }
}