package com.learn.springboot.conditional.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * 假设这个条件决定：是否启动Activiti流程引擎
 */
public class ActivitiCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String value=conditionContext.getEnvironment().getProperty("learn.activiti.enable");
        return "true".equals(value);
    }
}
