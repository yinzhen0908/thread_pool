package com.learning.demo;

import org.apache.commons.lang3.StringUtils;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.StopWatch;


/**
 * @Auther:yinzhen
 * @Date:2020/12/25 23:34
 * @Description:com.learning.demo
 * @version: 1.0
 */
public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        System.out.println(StringUtils.center(" ScheduledThreadPoolDemo ", 40, "="));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟三秒执行");
                stopWatch.stop();
                System.out.println(stopWatch.getTime(TimeUnit.SECONDS));
            }
        },3,TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}
