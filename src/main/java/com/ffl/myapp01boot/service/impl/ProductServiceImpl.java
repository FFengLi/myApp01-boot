package com.ffl.myapp01boot.service.impl;

import com.ffl.myapp01boot.bean.Product;
import com.ffl.myapp01boot.mapper.ProductMapper;
import com.ffl.myapp01boot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fanFengLi
 * @Date: 2023/08/03/17:29
 * @Description:
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> getProductList() {
        List<Product> products = productMapper.selectByExample(null);
        return products;
    }
}
