package com.learn.springboot.application;

import com.learn.springboot.profile.MyBean;
import com.learn.springboot.properties.ConfigurationJdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import javax.annotation.PostConstruct;
import java.util.List;


//@SpringBootApplication


/**只有启动了EnableAutoConfiguration，注解读取属性的@ConfigurationProperties才会生效
 * @author Join*/
@EnableAutoConfiguration
/**指定配置文件路径，没有指定则用默认的：application.properties*/
//@PropertySource("application.properties")
@ComponentScan(basePackages="com.learn.springboot",excludeFilters = {@ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,classes = {LearnSpringApplication.class})})
public class ProfileApplication {

    @Autowired
    List<MyBean> myBeanList;

    @Autowired
    ConfigurationJdbcProperties jdbcProperties;


    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(ProfileApplication.class);

        //通过内置函数指定profile，如果有多个且包含相同的属性名，则用后面的覆盖前面的值
        app.setAdditionalProfiles("test","dev");
        app.run(args);

        //通过启动参数参数指定profile，如果是jar包，则在jar包启动时指定参数
        //app.run("--spring.profiles.active=test");

        //通过启动参数指定profile，并且覆盖属性learn.jdbc.ip值
        //app.run("--spring.profiles.active=test","--learn.jdbc.ip=127.0.0.1");
    }

    @PostConstruct
    private void init(){
        System.out.println(myBeanList);
        System.out.println("拿到指定的profile配置："+jdbcProperties);
    }


}
