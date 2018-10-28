package com.learn.springboot.enablexxx.model;

import javax.annotation.PostConstruct;

/**
 * @author join
 */
public class MyUser1 {

    @PostConstruct
    private void init(){
        System.out.println("初始化: "+this.getClass().getName());
    }
}
