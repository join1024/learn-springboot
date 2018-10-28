package com.learn.springboot.enablexxx.annotation;

import com.learn.springboot.enablexxx.registrar.MyBeanLogDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 对指定包下面的Bean进行日志打印
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyBeanLogDefinitionRegistrar.class)
public @interface EnableBeanLog {
    String[] packages();
}
