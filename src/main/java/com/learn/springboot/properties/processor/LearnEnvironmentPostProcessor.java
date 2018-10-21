package com.learn.springboot.properties.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 通过EnvironmentPostProcessor注入属性
 * 注意：
 * EnvironmentPostProcessor implementations have to be registered in
 * {@code META-INF/spring.factories}, using the fully qualified name of this class as the
 * key.
 * 实现这个接口的类必须在 META-INF/spring.factories 中注册才会生效
 * org.springframework.boot.env.EnvironmentPostProcessor=com.learn.springboot.properties.processor.LearnEnvironmentPostProcessor
 */
@Component
public class LearnEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Properties properties=new Properties();
        properties.setProperty("test.environment.name","张三");
        properties.setProperty("test.environment.password","123456");

        /*try {
            //也可以从文件中读取配置，甚至从远处服务器读取配置
            properties.load(new FileInputStream("E://test.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        PropertiesPropertySource propertiesPropertySource=new PropertiesPropertySource("leanrnProperties",properties);

        environment.getPropertySources().addLast(propertiesPropertySource);

        System.out.println("environment.getPropertySources()="+environment.getPropertySources());
    }
}
