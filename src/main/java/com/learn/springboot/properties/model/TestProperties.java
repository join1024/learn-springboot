package com.learn.springboot.properties.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestProperties {

    @Value("${test.environment.name}")
    private String name;

    @Value("${test.environment.password}")
    private String password;

    @Override
    public String toString() {
        return "TestProperties{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
