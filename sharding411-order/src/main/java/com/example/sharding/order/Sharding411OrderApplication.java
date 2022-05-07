package com.example.sharding.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan("com.example.sharding.order.mapper")
public class Sharding411OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sharding411OrderApplication.class, args);
    }

}
