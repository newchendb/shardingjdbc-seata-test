package com.example.sharding.order.service;

import com.example.sharding.order.entity.Order;
import com.example.sharding.order.feign.ProductFeign;
import com.example.sharding.order.mapper.OrderMapper;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
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
//    @GlobalTransactional
    @ShardingTransactionType(TransactionType.BASE)
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
