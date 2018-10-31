package com.learn.springboot.listenerevent.listener;

import com.learn.springboot.listenerevent.event.MyEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.EventObject;

/**
 * 使用注解的方式来监听事件，而不必去实现ApplicationListener接口
 */
@Component
public class MyEventHandler {

    /**
     * 监听所有的事件：
     *
     * 使用注解的方式监听事件，
     * 这种方式会根据参数自动匹配事件，比如用Object ,则会监听所有事件,当然也可以用所有事件的顶级父类EventObject来代替Object。
     * @param allEvent
     */
    @EventListener
    public void listenAll(EventObject allEvent){
        System.out.println("MyEventHandler.listenAll -- 监听 ： "+allEvent.getSource());
    }

    /**
     * 监听MyEvent事件（包括其子类的事件）
     * @param myEvent
     */
    @EventListener
    public void listenMyEvent(MyEvent myEvent){
        System.out.println("MyEventHandler.listenMyEvent -- 监听： "+myEvent.getSource());
    }

    /**
     * 监听应用停止的事件ContextStoppedEvent，容器调用context.stop()时触发。
     * @param stoppedEvent
     */
    @EventListener
    public void listenContextStoppedEvent(ContextStoppedEvent stoppedEvent){
        System.out.println("MyEventHandler.listenContextStoppedEvent -- 监听： "+stoppedEvent.getSource());
    }



}
