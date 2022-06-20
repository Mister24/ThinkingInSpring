package com.fzw.springabc.no002_bean作用范围;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("productService")
public class ProductService {
    
    @Resource(name = "productDao")
    private ProductDao productDao;
    
    @Resource(name = "orderDao")
    private OrderDao orderDao;
    
    public void save() {
        System.out.println("ProductService中的save方法执行了......");
        productDao.save();
        orderDao.save();
    }
}
