package com.spring.xmlConfigurationDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApplication {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");

        Coach coach = classPathXmlApplicationContext.getBean("coach", Coach.class);
        System.out.println(coach);

        /*Coach coach1 = classPathXmlApplicationContext.getBean("coach", Coach.class);
        System.out.println(coach1);*/

        classPathXmlApplicationContext.close();
    }
}
