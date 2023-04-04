package com.burgir.customer;

import java.util.LinkedList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;

@Configuration
public class CustomerConfig {

  @Bean
  CommandLineRunner customerRunner(CustomerRepository customerRepository) {
    return args -> {
      LinkedList<Customer> customers = new LinkedList<Customer>();

      Faker faker = new Faker();

      for (int i = 0; i < 168; i++) {
        Customer c = new Customer(
            faker.name().firstName(),
            faker.name().lastName(),
            faker.address().country(),
            faker.address().city(),
            faker.address().streetName(),
            faker.address().buildingNumber(),
            faker.phoneNumber().cellPhone(),
            "test@gmail.com");

        customers.add(c);
      }

      customerRepository.saveAll(customers);
    };
  }

}
