package com.burgir.category;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryConfig {

  @Bean
  CommandLineRunner categoryRunner(CategoryRepository repository) {
    return args -> {
      Category c1 = new Category("Burger", "Pyszne hamburgerki 🍔");

      Category c2 = new Category("Napój", "Najlepsze napoje na swiecie 🧃");

      Category c3 = new Category("Sos", "Takich sosów jeszcze nie jadłeś 🍛");

      repository.saveAll(List.of(c1, c2, c3));
    };
  }

}
