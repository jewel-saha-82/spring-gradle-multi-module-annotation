package demo.product;

import common.CommonClass;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class Product {

    @Inject
    private CommonClass commonClass;

    public void x() {
        System.out.println("Product...........");
        commonClass.y();
    }
}
