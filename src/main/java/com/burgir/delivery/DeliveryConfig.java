package com.burgir.delivery;

import java.util.LinkedList;
import java.util.List;

import com.burgir.orders.Order;
import com.burgir.orders.OrderRepository;
import com.github.javafaker.Faker;

public class DeliveryConfig {

  public static LinkedList<Delivery> get(OrderRepository orderRepository) {
    List<Order> orders = orderRepository.findAll();
    Faker faker = new Faker();

    LinkedList<Delivery> deliveries = new LinkedList<Delivery>();

    for (Order o : orders) {
      Double distance = faker.number().randomDouble(2, 1, 50);
      // TODO other delivery values

      Delivery d = new Delivery(distance, true, 1l, 1l, 1l);

      deliveries.add(d);
    }

    return deliveries;
  }

}
