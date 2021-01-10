package com.codelong.log.annotion;

import com.codelong.log.config.LogMarker;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * EnableMyLog注解将LogMarker注入到spring容器
 *
 * @author longwang
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(LogMarker.class)
public @interface EnableMyLog {
}