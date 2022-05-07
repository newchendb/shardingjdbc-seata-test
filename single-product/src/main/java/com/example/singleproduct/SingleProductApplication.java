package com.example.singleproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.singleproduct.mapper")
public class SingleProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingleProductApplication.class, args);
    }

}
