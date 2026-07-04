package com.example.ant_mall.business.product.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ant_mall.common.entity.CommonEntity;

// import java.time.LocalDateTime;
// import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_product")
public class Product extends CommonEntity {

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品单价
     */
    private BigDecimal unitPrice;

    /**
     * 库存数量
     */
    private Integer stockQuantity;

}