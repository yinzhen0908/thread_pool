package com.learning.demo;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * @Auther:yinzhen
 * @Date:2020/12/25 23:34
 * @Description:com.learning.demo
 * @version: 1.0
 */
public class ScheduledThreadPoolDemo2 {
    public static void main(String[] args) {
        System.out.println(StringUtils.center(" ScheduledThreadPoolDemo ", 40, "="));
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.printf("第%s次执行，累计运行时间是%s秒\r\n",add(),stopWatch.getTime(TimeUnit.SECONDS));
            }
        },1,3,TimeUnit.SECONDS);
        //scheduledExecutorService.shutdown();
    }
    static int count=1;
    static int add(){
        return count++;
    }
}
