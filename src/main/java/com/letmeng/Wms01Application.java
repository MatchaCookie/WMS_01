package com.letmeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.letmeng.sys.mapper"})
public class Wms01Application {

    public static void main(String[] args) {
        SpringApplication.run(Wms01Application.class, args);
    }

}
