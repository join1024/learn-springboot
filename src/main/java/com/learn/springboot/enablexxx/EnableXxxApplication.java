package com.learn.springboot.enablexxx;

import com.learn.springboot.start.LearnSpringApplication;
import com.learn.springboot.conditional.config.MyConditionalConfiguration;
import com.learn.springboot.enablexxx.annotation.EnableMyUser2;
import com.learn.springboot.enablexxx.bean.MyUser;
import com.learn.springboot.profile.config.MyProfileConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;


//@SpringBootApplication

/**
 * @author join
 */
//@EnableMyUser
@EnableMyUser2
@ComponentScan(basePackages="com.learn.springboot.enablexxx")
public class EnableXxxApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(EnableXxxApplication.class,args);
        System.out.println(context.getBeansOfType(MyUser.class));
    }

}
