package com.example.ant_mall.business.product.bo;

import com.example.ant_mall.common.entity.PageBO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductQueryBO extends PageBO {
    @Schema(description = "商品名称")
    private String name;

    @Schema(description = "商品描述")
    private String description;
}
