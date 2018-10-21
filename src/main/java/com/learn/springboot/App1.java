package com.learn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@PropertySource("app.properties")
public class App1 {
    @Bean
    public Runnable createRunnable(){
        return ()-> System.out.println(" spring boot runnable started. ");
    }

    @Autowired
    private JdbcProperties jdbcProperties;

    public void printJdbcProperties(){
        System.out.println(jdbcProperties.toString());
    }

    @Value("${learn.jdbc.ip}")
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
