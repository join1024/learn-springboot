package com.learn.springboot.application;

import com.learn.springboot.profile.MyProfileConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;


//@SpringBootApplication

/**
 * @author join
 */
@EnableAutoConfiguration
@PropertySource("conditional.properties")
@ComponentScan(basePackages="com.learn.springboot",excludeFilters = {@ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,classes = {LearnSpringApplication.class, MyProfileConfiguration.class})})
public class ConditionalApplication {


    public static void main(String[] args) {
        SpringApplication.run(ConditionalApplication.class,args);
    }

}
