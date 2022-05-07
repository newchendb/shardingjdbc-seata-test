package com.example.sharding.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sharding.product.entity.Product;
import org.apache.ibatis.annotations.Update;

/**
 * @program: winsky
 * @description:
 * @author: chendebing
 * @create: 2022/4/27
 */
public interface ProductMapper extends BaseMapper<Product> {

    @Update("update product_info set stock = stock-1 where id=1")
    void minusStock();

}
