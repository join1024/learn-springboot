package com.learn.springboot.enablexxx.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyBeanLogPostProcessor implements BeanPostProcessor {

    private String[] packages;

    public String[] getPackages() {
        return packages;
    }

    public void setPackages(String[] packages) {
        this.packages = packages;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(packages==null){
            return bean;
        }

        List<String> list=Stream.of(packages).collect(Collectors.toList());

        //对指定包下面的Bean进行日志打印：
        list.forEach(pkg->{
            System.out.println(pkg);
            if(bean.getClass().getName().startsWith(pkg)){
                System.out.println(" 打印Bean日志 -> beanName:"+beanName+", beanClass="+bean.getClass().getName());
            }
        });

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
