package com.example.ant_mall.business.product.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProductQueryVO {
    @Schema(description = "商品id")
    private Long id;

    @Schema(description = "商品名称")
    private String name;

    @Schema(description = "商品描述")
    private String description;

    @Schema(description = "商品单价")
    private BigDecimal unitPrice;

    @Schema(description = "库存数量")
    private Integer stockQuantity;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "编辑时间")
    private LocalDateTime updateTime;
}
