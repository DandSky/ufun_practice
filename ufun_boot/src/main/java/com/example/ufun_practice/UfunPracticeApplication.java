package com.example.ufun_practice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ufun_practice.mapper")
public class UfunPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(UfunPracticeApplication.class, args);

    }

}
