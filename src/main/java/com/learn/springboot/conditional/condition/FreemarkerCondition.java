package com.learn.springboot.conditional.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * 假设这个条件决定：是否启动freemarker模板引擎
 */
public class FreemarkerCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String value=conditionContext.getEnvironment().getProperty("learn.freemarker.enable");
        return "true".equals(value);
    }
}
