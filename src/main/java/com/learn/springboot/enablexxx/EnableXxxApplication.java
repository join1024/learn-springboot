package com.learn.springboot.enablexxx;

import com.learn.springboot.enablexxx.annotation.EnableBeanLog;
import com.learn.springboot.enablexxx.annotation.EnableMyGirl;
import com.learn.springboot.enablexxx.annotation.EnableMyUser;
import com.learn.springboot.enablexxx.model.MyBoy;
import com.learn.springboot.enablexxx.model.MyUser1;
import com.learn.springboot.enablexxx.registrar.MyImportBeanDefinitionRegistrar;
import com.learn.springboot.enablexxx.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;


//@SpringBootApplication

/**
 * @author join
 */
@EnableMyUser
@EnableMyGirl
@Import({MyBoy.class,MyImportBeanDefinitionRegistrar.class})
//@EnableAsync
//对指定包下面的Bean进行日志打印
@EnableBeanLog(packages = {"com.learn.springboot.enablexxx.model"})
@ComponentScan(basePackages="com.learn.springboot.enablexxx")
public class EnableXxxApplication {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("EnableXxxApplication start ... 线程ID："+Thread.currentThread().getId());
        ConfigurableApplicationContext context=SpringApplication.run(EnableXxxApplication.class,args);
        System.out.println(context.getBeansOfType(MyUser1.class));

        context.getBean(MyService.class).run();

        System.out.println("\n$$$$$$ EnableXxxApplicaiton end .");
    }

}
