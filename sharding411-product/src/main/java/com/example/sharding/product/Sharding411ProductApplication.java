package com.example.sharding.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.sharding.product.mapper")
public class Sharding411ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sharding411ProductApplication.class, args);
    }

}
