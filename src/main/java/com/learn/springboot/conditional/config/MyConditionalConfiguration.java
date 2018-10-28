package com.learn.springboot.conditional.config;

import com.learn.springboot.conditional.condition.ActivitiCondition;
import com.learn.springboot.conditional.condition.FreemarkerCondition;
import com.learn.springboot.conditional.engine.MyActivitiEngine;
import com.learn.springboot.conditional.engine.MyFreemarkerEngine;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * 通过配置来构建Bean
 * @author join
 */
//该条件也可以直接作用在类上
//@Conditional({ActivitiCondition.class,FreemarkerCondition.class})
@SpringBootConfiguration
public class MyConditionalConfiguration {

    @Bean("myActivitiEngine")
    //“@Conditional”作用在方法上面
    @Conditional(ActivitiCondition.class)
    public MyActivitiEngine createMyActivitiEngine(){
        System.out.println("createMyActivitiEngine ... ");
        return new MyActivitiEngine();
    }

    @Bean("myFreemarkerEngine")
    //“@Conditional”作用在方法上面
    @Conditional(FreemarkerCondition.class)
    public MyFreemarkerEngine createMyFreemarkerEngine(){
        System.out.println("createMyFreemarkerEngine ...");
        return new MyFreemarkerEngine();
    }


}
