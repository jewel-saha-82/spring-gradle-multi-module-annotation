package module;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Component
public class Module1 {

    @Inject
    private Module2 module2;

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct = " + module2);
    }

    public void module1() {
        System.out.println("Module 1...");
        module2.module2();
    }
}
