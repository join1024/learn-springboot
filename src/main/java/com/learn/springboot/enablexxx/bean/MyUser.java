package com.learn.springboot.enablexxx.bean;

import javax.annotation.PostConstruct;

/**
 * @author join
 */
public class MyUser {

    @PostConstruct
    private void init(){
        System.out.println("加载MyUser。。。");
    }
}
