package com.transaction.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.transaction.product.mapper")
public class ProductSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductSampleApplication.class, args);
    }

}
