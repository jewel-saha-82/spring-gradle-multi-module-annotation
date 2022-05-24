package module;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class Module2 {

    @Inject
    private Module3 module3;

    public void module2() {
        System.out.println("Module 2...");
        module3.module3();
    }
}
