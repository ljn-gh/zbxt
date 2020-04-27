package com.ljnan.zbxt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
@MapperScan("com.ljnan.zbxt.mapper")
public class ZbxtApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZbxtApplication.class, args);
    }

}
