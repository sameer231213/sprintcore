package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("conf.xml");

        Student s = context.getBean("student1", Student.class);
       Student s2= context.getBean("student2", Student.class);
        System.out.println(s);
        System.out.println(s2);
    }
}