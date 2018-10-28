package com.learn.springboot.enablexxx.registrar;

import com.learn.springboot.enablexxx.annotation.EnableBeanLog;
import com.learn.springboot.enablexxx.model.MyGod1;
import com.learn.springboot.enablexxx.model.MyGod2;
import com.learn.springboot.enablexxx.processor.MyBeanLogPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author join
 */
public class MyBeanLogDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //获取EnableBeanLog注解的packages属性值
        Map<String,Object> attrs= importingClassMetadata.getAnnotationAttributes(EnableBeanLog.class.getName());
        String[] packages= (String[]) attrs.get("packages");

        //注册MyBeanLogPostProcessor类，并设置它的packages:
        BeanDefinitionBuilder beanDefinitionBuilder=BeanDefinitionBuilder.rootBeanDefinition(MyBeanLogPostProcessor.class);
        beanDefinitionBuilder.addPropertyValue("packages",packages);

        registry.registerBeanDefinition("myBeanLogPostProcessor",beanDefinitionBuilder.getBeanDefinition());
    }
}
