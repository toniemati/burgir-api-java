package com.burgir.orders;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

import com.github.javafaker.Faker;

public class OrderConfig {

  public static List<Order> get() {
    LinkedList<Order> orders = new LinkedList<Order>();
    Faker faker = new Faker();

    for (int i = 0; i < 419; i++) {
      Order o = new Order(
          LocalDateTime.of(
              LocalDate.of(
                  faker.number().numberBetween(2020, 2023),
                  faker.number().numberBetween(1, 12),
                  faker.number().numberBetween(1, 31)),
              LocalTime.of(
                  faker.number().numberBetween(0, 23),
                  faker.number().numberBetween(0, 50),
                  faker.number().numberBetween(0, 59))),
          faker.number().numberBetween(1l, 10)); // TODO - max to customersCount

      orders.add(o);
    }

    return orders;
  }

}
