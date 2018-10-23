package com.learn.springboot.application;

import com.sun.org.apache.xml.internal.security.Init;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author join
 */
@Component
public class LearnSpringApplication {

    @Qualifier("startRunnable")
    @Autowired
    private Runnable runnable;
    @PostConstruct
    private void init(){
        runnable.run();
    }

    public static void main(String[] args) {
        /**
         *  用 MyApplication.java作为springboot的primarySource来启动，
         *
         *  作为primarySource的 MyApplication.java类：
         *  1.可以理解为容器的一个根类（root类）
         *  2.MyApplication 自动交给容器管理，而不需要使用@Component等注解，如果不是primarySource类则需要相关注解spring才会管理
         *  3.可以在MyApplication.java类上添加Springboot相关注解和配置，当然也可以没有
         *
         */
        ConfigurableApplicationContext context= SpringApplication.run(MyApplication.class,args);

    }

}
