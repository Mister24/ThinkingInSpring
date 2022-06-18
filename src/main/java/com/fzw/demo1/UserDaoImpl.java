package com.fzw.demo1;

public class UserDaoImpl implements UserDao {

    private String name;

    public UserDaoImpl() {
    }

    public UserDaoImpl(String name) {
        this.name = name;
    }

    @Override
    public String save() {
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
    public void destroy() {
        System.out.println("UserDaoImpl#destroy()");
    }

}
