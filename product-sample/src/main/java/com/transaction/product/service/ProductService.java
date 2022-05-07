package com.transaction.product.service;

import com.transaction.product.mapper.ProductMapper;
import org.apache.shardingsphere.transaction.annotation.ShardingSphereTransactionType;
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
@Transactional(rollbackFor = Exception.class)
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public void minusStock() {
        productMapper.minusStock();
    }

}
