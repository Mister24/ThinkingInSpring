package com.fzw.no003_bean属性设置值;

import com.fzw.springabc.no002_bean作用范围.BossDaoImpl;
import com.fzw.springabc.no002_bean作用范围.ProductService;
import com.fzw.springabc.no002_bean作用范围.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo03 {
    
    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        BossDaoImpl bossDao = (BossDaoImpl) applicationContext.getBean("bossDao");
        System.out.println(bossDao.toString());
        
    }
    
    /*
     * Spring的IOC的注解方式
     */
    @Test
    public void demo03() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }
    
    @Test
    public void demo04() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productService");
        productService.save();
    }
}
