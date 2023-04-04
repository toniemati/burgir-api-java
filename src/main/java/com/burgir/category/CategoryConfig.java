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
      Category c1 = new Category("Burgery", "Przepyszne hamburgery 🍔");

      Category c2 = new Category("Dodatki", "Najlepsze dodatki 🍟");

      Category c3 = new Category("Sosy", "Sosy jakich jeszcze nie jadłeś 🍛");

      Category c4 = new Category("Napoje", "Orzeźwiające napoje 🧃");

      repository.saveAll(List.of(c1, c2, c3, c4));
    };
  }

}
