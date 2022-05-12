package order;

import annotation.Regional;
import org.springframework.stereotype.Component;
import interfaces.Type;

import javax.inject.Inject;

@Component
public class Order {

    @Inject
    @Regional //Just an Annotation created and decorated on OrderForm to get a bean of type this.
    private Type type;

    public void order() {
        System.out.println("\nFrom order.....");
        type.type();
    }
}
