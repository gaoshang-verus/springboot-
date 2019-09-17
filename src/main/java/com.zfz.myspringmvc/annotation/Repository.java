package com.zfz.myspringmvc.annotation;

import java.lang.annotation.*;

/**
 * 持久化层注解
 * Dao层注解
 */

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Repository {
    public String value();
}
