package com.example.ant_mall.business.product.bo;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductEditBO {
    @NotNull(message = "id不能为空")
    @Schema(description = "商品id")
    private Long id;

    @NotBlank(message = "商品名称不能为空")
    @Schema(description = "商品名称")
    private String name;

    @Schema(description = "商品描述")
    private String description;

    @Schema(description = "商品单价")
    private BigDecimal unitPrice;

    @Schema(description = "库存数量")
    private Integer stockQuantity;
}
