package com.fzw.springabc.no001_bean注入;

import javax.annotation.PreDestroy;

public class UserDaoImpl implements UserDao {

    private String name;

    public UserDaoImpl() {
    }

    public UserDaoImpl(String name) {
        this.name = name;
    }

    @Override
    public String save() {
        System.out.println("123");
        return "UserDaoImpl#save()";
    }

    public String getName() {
        return name;
    }

    // set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setup() {
        System.out.println("UserDaoImpl#setup()");
    }

    /*
     * 工厂被关闭之后，才会调用该方法
     */
    // 相对于 destroy-method
    @PreDestroy
    public void destroy() {
        System.out.println("UserDaoImpl#destroy()");
    }

}
