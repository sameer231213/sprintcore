package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("conf.xml");

        student s = (student)  context.getBean("student");

        s.display();
    }
}