package com.learn.springboot.listenerevent.event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source 事件源数据，可以放一些业务数据进去，在监听器中听过event.getSource()得到。
     */
    public MyEvent(Object source) {
        super(source);
    }
}
