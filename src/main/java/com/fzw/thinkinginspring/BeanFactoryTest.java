/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fzw.thinkinginspring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 通过xml向bean工厂添加java bean
 *
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
