package com.learn.springboot.conditional.engine;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * freemarker模板引擎
 * @author join
 */
public class MyFreemarkerEngine {
    //TODO 此处加载Freemarker模板引擎相关...

    @PostConstruct
    private void init(){
        System.out.println("加载Freemarker模板引擎...");
    }
}
