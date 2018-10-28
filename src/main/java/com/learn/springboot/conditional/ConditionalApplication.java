package com.learn.springboot.conditional;

import com.learn.springboot.start.LearnSpringApplication;
import com.learn.springboot.profile.config.MyProfileConfiguration;
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
@ComponentScan(basePackages="com.learn.springboot.conditional")
public class ConditionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConditionalApplication.class,args);
    }

}
