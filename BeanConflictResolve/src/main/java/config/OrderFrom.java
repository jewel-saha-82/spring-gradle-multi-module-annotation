package config;

import annotation.Regional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import type.Online;
import type.Shop;
import interfaces.Type;

@Component
public class OrderFrom {

    @Bean
    @Regional //Just an Annotation created and decorated on Order.java to set a bean of type this.
    public Type shop() {
        return new Shop();
    }

    @Bean
    public Type online() {
        return new Online();
    }
}
