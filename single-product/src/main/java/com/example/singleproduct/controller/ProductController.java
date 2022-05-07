package com.example.singleproduct.controller;

import com.example.singleproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: winsky
 * @description:
 * @author: chendebing
 * @create: 2022/4/27
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PutMapping("/minus/stock")
    public ResponseEntity<Void> minusStock() {
        productService.minusStock();
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
