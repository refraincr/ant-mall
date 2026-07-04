package com.example.ant_mall.business.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ant_mall.business.product.bo.ProductAddBO;
import com.example.ant_mall.business.product.bo.ProductEditBO;
import com.example.ant_mall.business.product.bo.ProductQueryBO;
import com.example.ant_mall.business.product.vo.ProductQueryVO;
import com.example.ant_mall.business.product.service.ProductService;
import com.example.ant_mall.common.entity.PageVO;

@Tag(name="商品管理")
@RestController
@Validated
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Operation(summary = "添加")
    @PostMapping("add")
    public void add(@Valid @RequestBody ProductAddBO addBO) {
        productService.add(addBO);
    }

    @Operation(summary = "编辑")
    @PostMapping("edit")
    public void edit(@Valid @RequestBody ProductEditBO editBO) {
        productService.edit(editBO);
    }
    
    @Operation(summary = "分页查询")
    @GetMapping("page")
    public PageVO<ProductQueryVO> page(ProductQueryBO queryBO) {
        return productService.page(queryBO);
    }

    @Operation(summary = "删除")
    @PostMapping("delete")
    public void delete(@NotEmpty @RequestBody List<Long> idList) {
        productService.edit(idList);
    }
}
