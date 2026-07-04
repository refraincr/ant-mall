package com.example.ant_mall.common.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PageBO {
    @Schema(description = "当前页",example="1")
    private Long currentPage = 0L;

    @Schema(description = "每页个数",example="10")
    private Long pageSize = 10L;

}
