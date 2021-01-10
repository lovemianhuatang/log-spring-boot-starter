package com.codelong.log.annotion;

import java.lang.annotation.*;

/**
 * 日志注解
 *
 * @author codelong
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface MyLog {

}