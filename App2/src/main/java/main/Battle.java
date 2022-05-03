package main;

import demo.product.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Battle {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("demo", "common"); //very top packages
        context.refresh(); //This is required
        Product product = (Product) context.getBean("product");
        product.x();
    }
}
