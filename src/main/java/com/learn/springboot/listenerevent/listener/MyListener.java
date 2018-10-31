package com.learn.springboot.listenerevent.listener;

import com.learn.springboot.listenerevent.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 通过实现ApplicationListener接口的方式来监听时间，根据泛型来监听对应的事件，比如这里监听MyEvent事件
 * @author join
 */
//@Component
public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("MyListener -- 监听器："+event.getSource());
    }
}
