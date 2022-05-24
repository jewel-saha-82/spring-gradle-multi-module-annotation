package main;

import beans.Intermediate;
import demo.product.Product;
import demo.validator.NewValidator;
import module.Module1;
import order.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Battle {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("demo", "common", "config", "order", "module"); //very top packages
        context.refresh(); //This is required


        Product product = (Product) context.getBean("product");
        product.x();
        System.out.println("Annotation.............\n");

        //@Coming from @Component bean
        Product p = (Product) context.getBean("p");
        product.x();

        //Bean Conflict resolve
        Order order = (Order) context.getBean("order");
        order.order();

        //--------------------------------------------------------------------------

        //This is not working....
//        ApplicationContext c = new ClassPathXmlApplicationContext("spring-test.xml");
//        Product product1 = (Product) c.getBean("product1");
//        System.out.println("XML.............");
//        product1.x();

        ApplicationContext c1 = new ClassPathXmlApplicationContext("spring-test.xml");
        Intermediate i = (Intermediate) c1.getBean("intermediate");
        i.I();

        System.out.println();
        NewValidator newValidator = (NewValidator) context.getBean("newValidator");
        newValidator.validator();

        System.out.println();
        Module1 module1 = (Module1) context.getBean("module1");
        module1.module1();

    }
}
