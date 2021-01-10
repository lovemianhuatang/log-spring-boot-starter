package com.codelong.log.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 *
 * @author codelong
 */
@Configuration
@EnableConfigurationProperties(MyLogProperties.class) // 该注解可以使MyLogProperties注入spring容器
@ConditionalOnBean(LogMarker.class) //当容器中有这个LogMarkerBean就会使得下面配置生效
public class MyLogAutoConfiguration {
    @Bean
    public MyLogAspect myLogAspect(@Autowired MyLogProperties myLogProperties) {
        return new MyLogAspect(myLogProperties);
    }
}