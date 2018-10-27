package com.learn.springboot.conditional.engine;

import com.learn.springboot.conditional.condition.ActivitiCondition;
import com.learn.springboot.conditional.condition.RedisCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * “@Conditional”作用在类上面
 * Redis存储引擎相关代码
 */
//不通过@Bean来创建了，则要记得配合@Component使用
@Component
//条件装配直接作用在类上
@Conditional(RedisCondition.class))
public class MyRedisEngine {
    //TODO 此处加载Redis存储引擎相关代码

    @PostConstruct
    private void init(){
        System.out.println("加载Redis存储引擎...");
    }
}
