package com.learn.springboot.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//@EnableAutoConfiguration
/**
 * ComponentScan：指定spring自动扫描加载组件：
 * 1. 加载的组件包含有@Component @Controller @Service等有spring注解的类
 * 2. 没有指定包路径则，默认加载启动类所在的包路径下的所有
 * @author Join
 */
@ComponentScan(basePackages="com.learn.springboot")
public class MyApplication {
    @Bean
    public Runnable startRunnable(){
        return ()-> System.out.println("启动成功：spring boot runnable started. ");
    }

}
