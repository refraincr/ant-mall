package com.example.ant_mall.business.product.bo;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProductAddBO {
    @NotBlank(message = "商品名称不能为空")
    @ApiModelProperty("商品名称")
    private String name;

    @ApiModelProperty("商品描述")
    private String description;

    @ApiModelProperty("商品单价")
    private BigDecimal unitPrice;

    @ApiModelProperty("库存数量")
    private Integer stockQuantity;
}
