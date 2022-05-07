package com.transaction.product.controller;

import com.transaction.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
