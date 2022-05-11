package config;

import demo.product.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config {

    @Bean
    public Product p() {
        return new Product();
    }
}
