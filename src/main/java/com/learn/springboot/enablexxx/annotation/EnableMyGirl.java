package com.learn.springboot.enablexxx.annotation;

import com.learn.springboot.enablexxx.model.MyGirl;
import com.learn.springboot.enablexxx.selector.MyUserImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyGirl.class)
public @interface EnableMyGirl {
}
