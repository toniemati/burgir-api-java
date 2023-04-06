package com.burgir.customer;

import java.util.LinkedList;
import java.util.List;

import com.github.javafaker.Faker;

public class CustomerConfig {

  public static List<Customer> get() {
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

    return customers;
  }

}
