package com.learn.springboot.enablexxx.model;

import javax.annotation.PostConstruct;

public class MyBoy {
    @PostConstruct
    private void init(){
        System.out.println("初始化: "+this.getClass().getName());
    }
}
