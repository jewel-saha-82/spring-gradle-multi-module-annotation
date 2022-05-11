package main;

import beans.Intermediate;
import demo.product.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Battle {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("demo", "common", "config"); //very top packages
        context.refresh(); //This is required
        Product product = (Product) context.getBean("product");
        product.x();
        System.out.println("Annotation.............\n");

        //@Coming from @Component bean
        Product p = (Product) context.getBean("p");
        product.x();

        //This is not working....
//        ApplicationContext c = new ClassPathXmlApplicationContext("spring-test.xml");
//        Product product1 = (Product) c.getBean("product1");
//        System.out.println("XML.............");
//        product1.x();

        ApplicationContext c1 = new ClassPathXmlApplicationContext("spring-test.xml");
        Intermediate i = (Intermediate) c1.getBean("intermediate");
        i.I();


    }
}
