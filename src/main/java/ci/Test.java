package ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("add.xml");

        Addition add = (Addition) context.getBean("add");
        add.doSum();
    }
}