package com.example.singleorder.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @program: winsky
 * @description:
 * @author: chendebing
 * @create: 2022/4/27
 */
@FeignClient("single-product")
public interface ProductFeign {

    @PutMapping("/minus/stock")
    Void minusStock();

}
