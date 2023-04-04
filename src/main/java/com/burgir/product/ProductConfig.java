package com.burgir.product;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

  @Bean
  CommandLineRunner productRunner(ProductRepository repository) {
    return args -> {
      Product p1 = new Product("cheeseburger", "img", "description", 20.21, 1l);

      Product p2 = new Product("spaghetti", "img", "description2", 15.40, 2l);

      Product p3 = new Product("ramen", "img", "description3", 9.99, 3l);

      repository.saveAll(List.of(p1, p2, p3));
    };
  }
}
