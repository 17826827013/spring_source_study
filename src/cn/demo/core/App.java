package cn.demo.core;

import cn.demo.core.bean.BeanTest;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @ Date  : Create in 11:31 2019/7/8
 */
public class App {

    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        BeanTest beanTest = (BeanTest) bf.getBean("myTestBean");
        System.out.println(beanTest.getTestStr());
    }
}
