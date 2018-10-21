package com.learn.springboot.application;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication
@EnableAutoConfiguration
/**
 * ComponentScan：指定spring自动扫描加载组件：
 * 1. 加载的组件包含有@Component @Controller @Service等有spring注解的类
 * 2. 没有指定包路径则，默认加载启动类所在的包路径下的所有
 */
@ComponentScan(basePackages="com.learn.springboot")

/**
 * 指定配置文件路径，没有指定则用默认的：application.properties
 */
@PropertySource("app.properties")
public class App {
    @Bean
    public Runnable createRunnable(){
        return ()-> System.out.println(" spring boot runnable started. ");
    }



}
