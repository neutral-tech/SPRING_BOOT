package com.neutraltech.components;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("AppConfig.xml");
        Employee employee=(Employee) context.getBean("beanName");
        System.out.println(employee.toString());
    }
}
