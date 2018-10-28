package com.learn.springboot.enablexxx.registrar;

import com.learn.springboot.enablexxx.model.MyGod1;
import com.learn.springboot.enablexxx.model.MyGod2;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author join
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinitionBuilder beanDefinitionBuilder1=BeanDefinitionBuilder.rootBeanDefinition(MyGod1.class);
        BeanDefinitionBuilder beanDefinitionBuilder2=BeanDefinitionBuilder.rootBeanDefinition(MyGod2.class);
        registry.registerBeanDefinition("god1",beanDefinitionBuilder1.getBeanDefinition());
        registry.registerBeanDefinition("god2",beanDefinitionBuilder2.getBeanDefinition());
    }
}
