package demo.validator;

import demo.product.Product;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class Validator {

    @Inject
    private Product product;

    public void validator() {
        System.out.println("Validator......");
        product.x();
    }
}
