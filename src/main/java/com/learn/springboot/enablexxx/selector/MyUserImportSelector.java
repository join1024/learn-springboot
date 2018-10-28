package com.learn.springboot.enablexxx.selector;

import com.learn.springboot.enablexxx.model.MyUser1;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author join
 */
public class MyUserImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("importingClassMetadata.getAnnotationTypes(): "+importingClassMetadata.getAnnotationTypes());
        return new String[]{"com.learn.springboot.enablexxx.model.MyUser2",MyUser1.class.getName()};
    }
}
