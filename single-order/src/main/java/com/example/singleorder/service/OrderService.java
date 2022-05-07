package com.example.singleorder.service;

import com.example.singleorder.entity.Order;
import com.example.singleorder.feign.ProductFeign;
import com.example.singleorder.mapper.OrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: winsky
 * @description:
 * @author: chendebing
 * @create: 2022/4/27
 */
@Service
public class OrderService {

    @Autowired
    private ProductFeign productFeign;

    @Autowired
    private OrderMapper orderMapper;

    @Transactional(rollbackFor = Exception.class)
    @GlobalTransactional
    public void seataDemo(Boolean hasError) {
        //下单操作
        Order order = new Order();
        order.setOrderName("测试数据");
        order.setBuyNum(1);
        orderMapper.insert(order);

        //减库存（这里参数什么的就自己脑补了）
        productFeign.minusStock();

        //异常模拟
        if (hasError) {
            int i = 1 / 0;
        }
    }

}
