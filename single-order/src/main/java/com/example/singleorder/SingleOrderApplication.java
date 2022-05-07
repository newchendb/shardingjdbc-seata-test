package com.example.singleorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan("com.example.singleorder.mapper")
public class SingleOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingleOrderApplication.class, args);
    }

}
