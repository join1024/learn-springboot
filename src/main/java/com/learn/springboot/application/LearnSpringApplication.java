package com.learn.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author join
 */
public class LearnSpringApplication {

    public static void main(String[] args) {
        /**
         *  用App.java作为springboot的primarySource来启动，
         *
         *  作为primarySource的App.java类：
         *  1.可以理解为容器的一个根类（root类）
         *  2.自动会作为一个Component给spring容器管理，在这个类里面可以有@Autowire等注解
         *  3.可以在App.java类上添加Springboot相关注解和配置，当然也可以没有
         *
         */

        ConfigurableApplicationContext context=SpringApplication.run(App.class,args);

    }

    public static void getBeanFromContext(ConfigurableApplicationContext context){
        //从容器中获取createRunnable，在App.java中通过@Bean注解定义
        ((Runnable)context.getBean("createRunnable")).run();
    }


}
