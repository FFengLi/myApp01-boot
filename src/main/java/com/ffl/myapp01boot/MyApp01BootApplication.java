package com.ffl.myapp01boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ffl.myapp01boot.mapper")
public class MyApp01BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApp01BootApplication.class, args);
    }

}
