package lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Newtest {

    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("New.xml");

       New s2 = (New) context.getBean("s1");

      System.out.println(s2);

        context.registerShutdownHook();

        System.out.println("++++++++++++++++++++++");
        System.out.println("######################");

        Pepsi p1=(Pepsi)context.getBean("p1");
        System.out.println(p1);

        Example example=(Example)context.getBean("example");
        System.out.println(example);
    }
}