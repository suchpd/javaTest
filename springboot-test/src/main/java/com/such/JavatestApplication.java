package com.such;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.such.mapper"})
public class JavatestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavatestApplication.class, args);
    }

}
