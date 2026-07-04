package com.example.ant_mall.business.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ant_mall.business.product.bo.ProductAddBO;
import com.example.ant_mall.business.product.service.ProductService;

@Tag(name="商品管理")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Operation(summary = "添加")
    @PostMapping("add")
    public void add(@Valid @RequestBody ProductAddBO addBO) {
        productService.add(addBO);
    }
    
}
