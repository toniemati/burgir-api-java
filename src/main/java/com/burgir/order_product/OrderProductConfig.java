package com.burgir.order_product;

import java.util.List;

import com.burgir.orders.Order;
import com.burgir.orders.OrderRepository;
import com.burgir.product.Product;
import com.burgir.product.ProductRepository;
import com.github.javafaker.Faker;

public class OrderProductConfig {

  public static void addProducts(
      OrderProductRepository orderProductRepository,
      OrderRepository orderRepository,
      ProductRepository productRepository) {

    Faker faker = new Faker();
    Long id = 1l;
    List<Order> orders = orderRepository.findAll();
    List<Product> products = productRepository.findAll();

    for (Order o : orders) {
      Long numOfProducts = faker.number().numberBetween(1l, 6l);

      for (int i = 0; i < numOfProducts; i++) {
        Product product = products.get(faker.number().numberBetween(1, products.size()));

        orderProductRepository.addProduct(id++, o.getId(), product.getId());
      }
    }
  }

}
