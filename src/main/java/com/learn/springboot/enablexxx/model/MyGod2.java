package com.learn.springboot.enablexxx.model;

import javax.annotation.PostConstruct;

public class MyGod2 {
    @PostConstruct
    private void init(){
        System.out.println("Oh！！ My god 2!");
    }
}
