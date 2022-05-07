package com.example.sharding.order.controller;

import com.example.sharding.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: winsky
 * @description:
 * @author: chendebing
 * @create: 2022/4/26
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/seata/test")
    public ResponseEntity<Void> seataDemo(Boolean hasError) {
        orderService.seataDemo(hasError);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
