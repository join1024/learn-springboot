package com.learn.springboot.listenerevent;

import com.learn.springboot.listenerevent.event.MyEvent;
import com.learn.springboot.listenerevent.listener.MyListener;
import com.learn.springboot.listenerevent.model.MyEventSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


//@SpringBootApplication

/**
 * @author join
 */
@SpringBootApplication
@ComponentScan(basePackages="com.learn.springboot.listenerevent")
public class ListenerEventApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(ListenerEventApplication.class,args);

        /**
         * 一、注册事件监听器：
         * 1.实现ApplicationListener接口的监听器有三种方式注册：
         * （1） 代码注册：context.addApplicationListener(new MyListener())
         * （2） 在事件类（比如MyListener类）上添加@Component注解，纳入容器管理即可
         * （3） 通过属性配置：context.listener.classes=com.learn.springboot.listenerevent.listener.MyListener
         * 如果在方法上使用 @EventListener 注解，则不需要手动注册
         */
        context.addApplicationListener(new MyListener());

        /**
         * 二、发布事件
         */
        context.publishEvent(new MyEvent(new MyEventSource("test","测试事件")));

        //停止容器之后，会发布应用停止事件ContextStoppedEvent，可以通过监听器监听的到
        context.stop();

        context.close();
    }

}
