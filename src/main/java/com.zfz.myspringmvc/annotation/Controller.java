package com.zfz.myspringmvc.annotation;

import java.lang.annotation.*;

/**
 * 控制层注解
 * 模拟springMVC @controller注解
 */

@Documented //javadoc
@Target(ElementType.TYPE) //作用于类上
@Retention(RetentionPolicy.RUNTIME) //限制Annotation的生命周期，自定义注解需要运行时保密
public @interface Controller {
    /**
     * 作用于该类上的注解有一个value属性 说白了就是controller的名称
     */
    public String value();
}
