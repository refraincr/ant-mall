package com.example.ant_mall.business.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.example.ant_mall.business.product.entity.Product;
import com.example.ant_mall.business.product.bo.ProductAddBO;

public interface ProductService extends IService<Product> {
    void add(ProductAddBO addBO);
}
