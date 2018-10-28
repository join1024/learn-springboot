package com.learn.springboot.conditional.condition;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 假设这个条件决定：Redis是否启动
 * @author join
 */
@SpringBootConfiguration
public class RedisCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String value=conditionContext.getEnvironment().getProperty("learn.redis.enable");
        return "true".equals(value);
    }
}
