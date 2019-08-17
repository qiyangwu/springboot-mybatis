package com.ksxan.wuqy.ibatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.ksxan.wuqy.ibatisdemo.common.model.dao")
public class IbatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbatisDemoApplication.class, args);
    }

}
