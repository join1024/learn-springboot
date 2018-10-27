package com.learn.springboot.profile;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * @author Join 2018-10-23
 */
@SpringBootConfiguration
public class MyProfileConfiguration {

    @Bean
    public MyBean startMyBean(){
        System.out.println("runnable default");
        return new MyBean("default");
    }

    @Bean
    //只有激活了dev配置才会执行这个方法创建Bean
    @Profile("dev")
    public MyBean startMyBeanDev(){
        System.out.println("runnable dev");
        return new MyBean("dev");
    }

    @Bean
    //只有激活了test配置才会执行这个方法创建Bean
    @Profile("test")
    public MyBean startMyBeanTest(){
        System.out.println("runnable test");
        return new MyBean("test");
    }

}
