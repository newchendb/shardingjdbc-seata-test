package com.example.singleproduct.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.singleproduct.entity.Product;
import org.apache.ibatis.annotations.Update;

/**
 * @program: winsky
 * @description:
 * @author: chendebing
 * @create: 2022/4/27
 */
public interface ProductMapper extends BaseMapper<Product> {

    @Update("update single_product set stock = stock-1 where id=1")
    void minusStock();

}
