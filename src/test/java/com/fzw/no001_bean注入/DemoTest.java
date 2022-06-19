package com.fzw.no001_bean注入;

import com.fzw.springabc.no001_bean注入.UserDaoImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    @Test
    public void test() {
        UserDaoImpl userDao;
        userDao = new UserDaoImpl("2");
        Assert.assertEquals("UserDaoImpl#save()", userDao.save());
        Assert.assertNotNull(userDao.getName());
        userDao.setName("name");
        Assert.assertEquals("name", userDao.getName());

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl dao = (UserDaoImpl) applicationContext.getBean("userDao");
        Assert.assertEquals("UserDaoImpl#save()", dao.save());
        Assert.assertNull(dao.getName());

        UserDaoImpl userDao1 = (UserDaoImpl) applicationContext.getBean("userDao1");
        Assert.assertEquals("UserDaoImpl#save()", userDao1.save());
        Assert.assertEquals("name", userDao1.getName());

        UserDaoImpl userDao2 = (UserDaoImpl) applicationContext.getBean("userDao2");
        Assert.assertEquals("UserDaoImpl#save()", userDao2.save());
        Assert.assertEquals("12", userDao2.getName());

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userDao3 = (UserDaoImpl) applicationContext.getBean("userDao3");
        Assert.assertEquals("UserDaoImpl#save()", userDao3.save());
        Assert.assertEquals("userDao3", userDao3.getName());
        classPathXmlApplicationContext.close();
    }


}
