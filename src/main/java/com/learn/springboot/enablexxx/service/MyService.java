package com.learn.springboot.enablexxx.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    /**
     * 只有启用了“@EnableAsync”异步注解才会生效
     * @throws InterruptedException
     */
    @Async
    public void run() throws InterruptedException {
        System.out.println("线程ID："+Thread.currentThread().getId());
        for(int i=0;i<5;i++){
            Thread.sleep(200);
            System.out.println(i);
        }

    }
}
