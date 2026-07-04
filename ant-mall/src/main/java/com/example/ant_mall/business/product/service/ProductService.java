package com.example.ant_mall.business.product.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

import com.example.ant_mall.business.product.entity.Product;
import com.example.ant_mall.business.product.vo.ProductQueryVO;
import com.example.ant_mall.common.entity.PageVO;
import com.example.ant_mall.business.product.bo.ProductAddBO;
import com.example.ant_mall.business.product.bo.ProductEditBO;
import com.example.ant_mall.business.product.bo.ProductQueryBO;

public interface ProductService extends IService<Product> {
    void add(ProductAddBO addBO);
    void edit(ProductEditBO editBO);
    PageVO<ProductQueryVO> page(ProductQueryBO queryBO);
    void delete(List<Long> idList);
}
