package com.burgir.orders;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class OrderService {

  private final OrderRepository orderRepository;

  public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public List<Order> index() {
    return this.orderRepository.findAll();
  }

  public Order store(Order order) {
    return this.orderRepository.save(order);
  }

  public Order show(Long id) {
    boolean exists = this.orderRepository.existsById(id);

    if (!exists) {
      throw new IllegalStateException("Order with ID: " + id + " does not exist!");
    }

    return this.orderRepository.findById(id).get();
  }

  @Transactional
  public Order update(Long id, Long customerId) {
    Order order = this.orderRepository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Order with ID: " + id + " does not exist!"));

    if (customerId != null) {
      order.setCustomerId(customerId);
    }

    return order;
  }

  public Order destroy(Long id) {
    boolean exists = this.orderRepository.existsById(id);

    if (!exists) {
      new IllegalStateException("Order with ID: " + id + " does not exist!");
    }

    Order order = this.orderRepository.findById(id).get();

    this.orderRepository.deleteById(id);

    return order;
  }

}
