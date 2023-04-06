package com.burgir.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.burgir.orders.Order;
import com.burgir.orders.OrderRepository;

@Configuration
public class DeliveryConfig {

  @Autowired
  private OrderRepository orderRepository;

  @Bean
  @org.springframework.core.annotation.Order(1)
  CommandLineRunner deliveryRunner(DeliveryRepository repository) {
    return args -> {
      List<Order> orders = this.orderRepository.findAll();

      System.out.println("orders: " + orders.size());
    };
  }

}
