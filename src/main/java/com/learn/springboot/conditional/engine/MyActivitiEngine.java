package com.learn.springboot.conditional.engine;

import com.learn.springboot.conditional.condition.ActivitiCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Activiti流程引擎相关代码
 * @author join
 */
public class MyActivitiEngine {
    //TODO 此处加载Activiti流程引擎相关代码

    @PostConstruct
    private void init(){
        System.out.println("加载Activiti流程引擎...");
    }
}
