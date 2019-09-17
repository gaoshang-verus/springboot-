package com.zfz.myspringmvc.annotation;

import java.lang.annotation.*;

/**
 * @Qualifier 提供依赖注入
 **/

@Documented
@Target(ElementType.FIELD) //作用于字段上，实现注入
@Retention(RetentionPolicy.RUNTIME)
public @interface Qualifier {
    public String value();
}
