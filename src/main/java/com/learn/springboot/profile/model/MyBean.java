package com.learn.springboot.profile.model;

/**
 * @author Join 2018-10-23
 */
public class MyBean {

    private String desc;

    public MyBean(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "MyBean{" +
            "desc='" + desc + '\'' +
            '}';
    }
}
