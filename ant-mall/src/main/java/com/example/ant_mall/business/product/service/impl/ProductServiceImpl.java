package com.example.ant_mall.business.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import com.example.ant_mall.business.product.entity.Product;
import com.example.ant_mall.business.product.mapper.ProductMapper;
import com.example.ant_mall.business.product.service.ProductService;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
