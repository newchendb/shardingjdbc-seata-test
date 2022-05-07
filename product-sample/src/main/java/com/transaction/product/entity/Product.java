package com.transaction.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @program: winsky
 * @description:
 * @author: chendebing
 * @create: 2022/4/27
 */
@Data
@TableName("product_info")
public class Product {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String productName;

    private Integer stock;

    private Date createTime;

    private Date updateTime;

}
