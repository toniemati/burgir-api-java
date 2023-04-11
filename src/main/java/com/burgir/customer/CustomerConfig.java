package com.burgir.customer;

import java.util.LinkedList;
import java.util.List;

import com.github.javafaker.Faker;

public class CustomerConfig {

  public static List<Customer> get() {
    LinkedList<Customer> customers = new LinkedList<Customer>();

    Faker faker = new Faker();

    for (int i = 0; i < 168; i++) {
      String firstName = faker.name().firstName();
      String lastName = faker.name().lastName();

      Customer c = new Customer(
          firstName,
          lastName,
          faker.address().country(),
          faker.address().city(),
          faker.address().streetName(),
          faker.address().buildingNumber(),
          faker.phoneNumber().cellPhone(),
          (firstName + "." + lastName + "@gmail.com").toLowerCase());

      customers.add(c);
    }

    return customers;
  }

}
