package com.fzw.springabc.no002_bean作用范围;

import com.fzw.springabc.no001_bean注入.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    
    //注入UserDao，此时可以没有set方法
    @Autowired
    private UserDao userDao;
    
    @Override
    public void save() {
        System.out.println("UserServiceImpl中的save方法执行了......");
        userDao.save();
    }
    
}