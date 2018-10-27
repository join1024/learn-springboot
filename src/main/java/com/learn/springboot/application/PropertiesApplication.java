package com.learn.springboot.application;

import com.learn.springboot.properties.ConfigurationJdbcProperties;
import com.learn.springboot.properties.EnvironmentJdbcProperties;
import com.learn.springboot.properties.TestProperties;
import com.learn.springboot.properties.ValueJdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;


//@SpringBootApplication
/**只有启动了EnableAutoConfiguration，注解读取属性的@ConfigurationProperties才会生效*/
@EnableAutoConfiguration
/**指定配置文件路径，没有指定则用默认的：application.properties*/
@PropertySource("application.properties")
@ComponentScan(basePackages="com.learn.springboot",excludeFilters = {@ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,classes = {LearnSpringApplication.class})})
public class PropertiesApplication {

    @Autowired
    private ValueJdbcProperties valueProperties;

    @Autowired
    private ConfigurationJdbcProperties jdbcProperties;

    @Autowired
    private EnvironmentJdbcProperties environmentJdbcProperties;

    @Autowired
    private TestProperties testProperties;

    public static void main(String[] args) {
        SpringApplication.run(PropertiesApplication.class,args);
    }

    @PostConstruct
    private void init(){
        System.out.println("通过@Value得到属性值："+valueProperties);
        System.out.println("通过@ConfigurationProperties得到属性值："+jdbcProperties);
        System.out.println("通过Environment得到属性："+environmentJdbcProperties);
        System.out.println("通过EnvironmentPostProcessor注入配置："+testProperties);
    }





}
