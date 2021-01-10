package com.codelong.log.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * 日志配置文件类
 *
 * @author codelong
 */
@ConfigurationProperties(value = "mylog")
@PropertySource(value = "classpath:application.yml", encoding = "UTF-8")
public class MyLogProperties {
    /**
     * 日志开始前缀
     */
    private String prefix;
    /**
     * 日志结束前缀
     */
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}