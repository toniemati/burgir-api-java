package com.burgir.customer;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

  @Bean
  CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
    return args -> {
      Customer s1 = new Customer(
          "Mario",
          "Balotelli",
          "Polska",
          "Gdańsk",
          "Słoneczna",
          "10",
          "123123123",
          "mario@gmail.com");

      Customer s2 = new Customer(
          "Symere",
          "Woods",
          "Polska",
          "Wrocław",
          "Krótka",
          "69",
          "123456789",
          "s.woods@gmail.com");

      customerRepository.saveAll(List.of(s1, s2));
    };
  }
}
