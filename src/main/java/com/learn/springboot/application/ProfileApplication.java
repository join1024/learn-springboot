package com.learn.springboot.application;

import com.learn.springboot.config.MyBean;
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
import java.util.List;


//@SpringBootApplication


/**只有启动了EnableAutoConfiguration，注解读取属性的@ConfigurationProperties才会生效
 * @author Join*/
@EnableAutoConfiguration
/**指定配置文件路径，没有指定则用默认的：application.properties*/
@PropertySource("app.properties")
@ComponentScan(basePackages="com.learn.springboot",excludeFilters = {@ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,classes = {LearnSpringApplication.class})})
public class ProfileApplication {

    @Autowired
    List<MyBean> myBeanList;

    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(ProfileApplication.class);
        //app.setAdditionalProfiles("dev");
        app.setAdditionalProfiles("test");
        app.run(args);
    }

    @PostConstruct
    private void init(){
        System.out.println(myBeanList);
    }


}
