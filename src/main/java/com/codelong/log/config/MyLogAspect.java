package com.codelong.log.config;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

/**
 * MyLog注解切面类
 *
 * @author codelong
 */
@Aspect
public class MyLogAspect {

    private MyLogProperties myLogProperties;

    public MyLogAspect(MyLogProperties myLogProperties) {
        this.myLogProperties = myLogProperties;
    }

    @Pointcut("@annotation(com.codelong.log.annotion.MyLog)")
    public void logAnnotationAnnotationPointcut() {
    }

    @Around("logAnnotationAnnotationPointcut()")
    public Object logInvoke(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(myLogProperties.getPrefix().concat(Arrays.toString(joinPoint.getArgs())));
        Object obj = joinPoint.proceed();
        System.out.println(myLogProperties.getSuffix().concat(obj.toString()));
        return obj;
    }

}