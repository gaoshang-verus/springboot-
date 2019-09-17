package com.zfz.myspringmvc.annotation;

import java.lang.annotation.*;

/**
 * @RequestMapping 提供URL地址处理映射
 */

@Documented
@Target({ElementType.METHOD,ElementType.TYPE})  //该注解可用于类以及方法上
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
    public String value();
}
