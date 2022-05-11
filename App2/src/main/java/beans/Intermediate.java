package beans;

import demo.product.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Intermediate {

    public void I() {
        System.out.println("\nInside Intermediate.....");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("demo", "common", "config"); //very top packages
        context.refresh(); //This is required
        Product product = (Product) context.getBean("product");
        product.x();
        System.out.println("Annotation from Intermediate.............");
    }
}
