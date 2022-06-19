package com.fzw.springabc.no002_bean作用范围;

import com.fzw.springabc.no001_bean注入.UserDao;

public class CustomerDaoImpl implements UserDao {
    
    public void setup() {
        System.out.println("CustomerDaoImpl#setup()");
    }
    
    @Override
    public String save() {
        System.out.println("CustomerDaoImpl#save()");
        return "CustomerDaoImpl#save()";
    }
    
    /*
     * 工厂被关闭之后，才会调用该方法
     */
    public void destroy() {
        System.out.println("CustomerDaoImpl#destroy()");
    }
}
