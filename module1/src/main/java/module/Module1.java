package module;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class Module1 {

    @Inject
    private Module2 module2;

    public void module1() {
        System.out.println("Module 1...");
        module2.module2();
    }
}
