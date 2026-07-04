package com.example.ant_mall.business.product.service.impl;

import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import com.example.ant_mall.business.product.entity.Product;
import com.example.ant_mall.business.product.mapper.ProductMapper;
import com.example.ant_mall.business.product.bo.ProductAddBO;
import com.example.ant_mall.business.product.service.ProductService;


@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Override
    public void add(ProductAddBO addBO) {
        Product product = new Product();
        BeanUtils.copyProperties(addBO, product);

        save(product);
    }
    
}
