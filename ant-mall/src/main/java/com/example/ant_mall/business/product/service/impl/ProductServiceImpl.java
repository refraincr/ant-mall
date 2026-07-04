package com.example.ant_mall.business.product.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils; 

import com.example.ant_mall.business.product.entity.Product;
import com.example.ant_mall.business.product.mapper.ProductMapper;
import com.example.ant_mall.business.product.bo.ProductAddBO;
import com.example.ant_mall.business.product.bo.ProductEditBO;
import com.example.ant_mall.business.product.bo.ProductQueryBO;
import com.example.ant_mall.business.product.service.ProductService;
import com.example.ant_mall.business.product.vo.ProductQueryVO;
import com.example.ant_mall.common.entity.PageVO;


@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Override
    public void add(ProductAddBO addBO) {
        Product product = new Product();
        BeanUtils.copyProperties(addBO, product);

        save(product);
    }

    @Override
    public void edit(ProductEditBO editBO) {
        Product product = new Product();
        BeanUtils.copyProperties(editBO, product);

        updateById(product);
    }

    @Override
    public PageVO<ProductQueryVO> page(ProductQueryBO queryBO) {
        // 分页参数
        Page<Product> pageRequest = 
            new Page<>(queryBO.getCurrentPage(),queryBO.getPageSize());

        // sql查询
        Page<Product> page = lambdaQuery()
            .eq(StringUtils.hasText(queryBO.getName()),
                Product::getName,queryBO.getName())
            .like(StringUtils.hasText(queryBO.getDescription()),
                Product::getDescription,queryBO.getDescription())
            .orderByAsc(Product::getCreateTime)
            .page(pageRequest);
            
        // 转换查询结果数据
        List<ProductQueryVO> productQueryVOList = new ArrayList<>();
        List<Product> productList = page.getRecords();
        for (Product product : productList) {
            ProductQueryVO productQueryVO = new ProductQueryVO();
            BeanUtils.copyProperties(product, productQueryVO);
            productQueryVOList.add(productQueryVO);
        }

        // 构造返回结果
        PageVO<ProductQueryVO> pageVO = new PageVO<>();
        pageVO.setCurrentPage(page.getCurrent());
        pageVO.setPageSize(page.getPages());
        pageVO.setTotalSize(page.getTotal());

        pageVO.setDataList(productQueryVOList);

        return pageVO;
    }

    @Override
    public void delete(List<Long> idList) {
        removeBatchByIds(idList);
    }
}
