package com.learn.springboot.enablexxx.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author join
 */
public class MyUserImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("importingClassMetadata.getAnnotationTypes(): "+importingClassMetadata.getAnnotationTypes());
        return new String[]{"com.learn.springboot.enablexxx.bean.MyUser"};
    }
}
