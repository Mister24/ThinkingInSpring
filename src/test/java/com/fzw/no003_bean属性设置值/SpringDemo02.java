package com.fzw.no003_bean属性设置值;

import com.fzw.springabc.no002_bean作用范围.Car;
import com.fzw.springabc.no002_bean作用范围.CollectionBean;
import com.fzw.springabc.no002_bean作用范围.Employee;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo02 {
    
    /*
     * 生命周期的配置
     */
    @Test
    public void demo01() {
        System.out.println("===");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        
        // xml中构造注入，set注入
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car.toString());
    
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.toString());
    
        // p命名空间
        Car car1 = (Car) applicationContext.getBean("car1");
        System.out.println(car1.toString());
    
        Employee employee1 = (Employee) applicationContext.getBean("employee1");
        System.out.println(employee1.toString());
    
        // SpEL语法
        Car car2 = (Car) applicationContext.getBean("car2");
        System.out.println(car2.toString());
    
        Employee employee2 = (Employee) applicationContext.getBean("employee2");
        System.out.println(employee2.toString());
    }
    
    @Test
    public void testCollections() {
        System.out.println("===");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean)applicationContext.getBean("collectionBean");
        System.out.println(collectionBean.toString());;
    }
    
}