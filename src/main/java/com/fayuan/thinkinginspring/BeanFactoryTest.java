/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.thinkinginspring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author mr.24
 * @version Id: BeanFactoryTest, v 1.0 2019-06-03 15:49 Exp $$
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactory.xml"));
        MyBean myBean = (MyBean)beanFactory.getBean("myTestBean");

        System.out.println(myBean.getStr());
    }
}
