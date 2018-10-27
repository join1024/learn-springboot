package com.learn.springboot.conditional.engine;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * freemarker模板引擎
 * “@ConditionalOnProperty”表示存在learn.hibernate.enable属性并且为true时，才会装配这个类
 * matchIfMissing=false 表示不存在对应属性时条件匹配失败
 * @author join
 */
@Component
@ConditionalOnProperty(name={"learn.hibernate.enable"},havingValue="true",matchIfMissing = false)
public class MyHibernateEngine {
    //TODO 此处加载Freemarker模板引擎相关...

    @PostConstruct
    private void init(){
        System.out.println("加载hibernate模板引擎...");
    }
}
