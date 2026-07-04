package com.example.ant_mall.common.entity;

// import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class PageVO<T> {
    @Schema(description = "当前页",example="1")
    private Long currentPage = 0L;

    @Schema(description = "每页个数",example="10")
    private Long pageSize = 10L;

    @Schema(description = "总个数",example="100")
    private Long totalSize = 0L;

    private List<T> dataList;
}
