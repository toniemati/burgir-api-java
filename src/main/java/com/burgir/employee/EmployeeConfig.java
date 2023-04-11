package com.burgir.employee;

import java.time.LocalDateTime;
import java.util.LinkedList;

import com.github.javafaker.Faker;

public class EmployeeConfig {

  public static LinkedList<Employee> get() {
    LinkedList<Employee> employees = new LinkedList<Employee>();
    Faker faker = new Faker();

    for (int i = 0; i < 24; i++) {
      Employee e = new Employee(
          faker.name().firstName(),
          faker.name().lastName(),
          false,
          faker.job().title(),
          LocalDateTime.now(),
          faker.number().randomDouble(2, 2000, 5000),
          faker.address().fullAddress());

      employees.add(e);
    }

    return employees;
  }

}
