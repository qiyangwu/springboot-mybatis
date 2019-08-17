package com.ksxan.wuqy.ibatisdemo.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author wuqy
 * 2018/12/3 16:55
 */
@Configuration
public class ConfigurationCoreBean {
    private Logger logger = LoggerFactory.getLogger(ConfigurationCoreBean.class);

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectType("mysql");
        return paginationInterceptor;
    }
}