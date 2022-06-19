package com.fzw.no002_bean作用范围;

import com.fzw.springabc.no001_bean注入.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo02 {
    
    /*
     * 生命周期的配置
     */
    @Test
    public void demo01() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao customerDaoSingleton1 = (UserDao) applicationContext.getBean("customerDaoSingleton");
        UserDao customerDaoSingleton2 = (UserDao) applicationContext.getBean("customerDaoSingleton");
        System.out.println(customerDaoSingleton1);
        System.out.println(customerDaoSingleton2);
        //true，bean默认即单例创建
        System.out.println(customerDaoSingleton1 == customerDaoSingleton2);
    
        customerDaoSingleton1.save();
        customerDaoSingleton2.save();
        //此时，CustomerDaoImpl这个类是被单例创建的，当工厂类被关闭时，destroy-method属性中配置的方法就能被执行了。
        applicationContext.close();
    
        System.out.println("===");
        
        ClassPathXmlApplicationContext applicationContext1= new ClassPathXmlApplicationContext("applicationContext.xml");
    
        UserDao customerDaoPrototype1 = (UserDao) applicationContext1.getBean("customerDaoPrototype");
        UserDao customerDaoPrototype2 = (UserDao) applicationContext1.getBean("customerDaoPrototype");
        System.out.println(customerDaoPrototype1);
        System.out.println(customerDaoPrototype2);
        //false，scope=prototype的情况下，非单例
        System.out.println(customerDaoPrototype1 == customerDaoPrototype2);
    
        //此时，CustomerDaoImpl这个类是被单例创建的，当工厂类被关闭时，destroy-method属性中配置的方法就能被执行了。
        applicationContext.close();
        
    }
    
}