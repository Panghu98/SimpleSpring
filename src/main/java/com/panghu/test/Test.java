package com.panghu.test;

import com.panghu.service.UserService;
import org.spring.util.BeanFactory;

public class Test {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory("spring.xml");

        UserService service = (UserService) beanFactory.getBean("service");

        service.find();
    }
}
