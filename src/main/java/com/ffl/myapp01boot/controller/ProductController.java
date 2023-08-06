package com.ffl.myapp01boot.controller;

import com.ffl.myapp01boot.bean.Product;
import com.ffl.myapp01boot.common.ResponseData;
import com.ffl.myapp01boot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fanFengLi
 * @Date: 2023/08/03/17:27
 * @Description:
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getProductList")
    public ResponseData<List<Product>> getProductList(){
      List<Product> productList = productService.getProductList();
        return ResponseData.ok(productList);
    }
}
