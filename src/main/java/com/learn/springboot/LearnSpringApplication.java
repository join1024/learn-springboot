package com.learn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.quartz.QuartzProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
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

        ConfigurableApplicationContext context=SpringApplication.run(App1.class,args);

        //getBeanFromContext(context);
        //readPropertiesFromEnvironment(context);
        //readPropertiesFromValue(context);
        readPropertiesFromJdbcPropertiesBean(context);
    }

    public static void getBeanFromContext(ConfigurableApplicationContext context){
        //从容器中获取createRunnable，在App.java中通过@Bean注解定义
        ((Runnable)context.getBean("createRunnable")).run();
    }

    public static void readPropertiesFromEnvironment(ConfigurableApplicationContext context){
        System.out.println("\nN$$$$$$  readPropertiesFromEnvironment   ");
        Environment evn=context.getEnvironment();
        System.out.println(evn.getProperty("learn.jdbc.ip"));
        System.out.println(evn.getProperty("learn.jdbc.port"));
        System.out.println();
    }

    public static void readPropertiesFromValue(ConfigurableApplicationContext context){
        System.out.println("\nN$$$$$$  readPropertiesFrom @Value   ");
        App1 app=context.getBean(App1.class);
        System.out.println(app.getIp());
        System.out.println();
    }



    public static void readPropertiesFromJdbcPropertiesBean(ConfigurableApplicationContext context){
        System.out.println("\nN$$$$$$  readPropertiesFromJdbcPropertiesBean @ConfigurationProperties   ");
        App1 app=context.getBean(App1.class);
        app.printJdbcProperties();
        System.out.println();
    }


}
