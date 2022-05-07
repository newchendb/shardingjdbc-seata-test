package com.transaction.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan("com.transaction.order.mapper")
public class OrderSamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderSamplesApplication.class, args);
    }

}
