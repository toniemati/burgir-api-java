package com.burgir.order_product;

import com.burgir.orders.OrderRepository;
import com.burgir.product.ProductRepository;

public class OrderProductConfig {

  public static void addProducts(
      OrderProductRepository orderProductRepository,
      OrderRepository orderRepository,
      ProductRepository productRepository) {

    orderProductRepository.addProduct(1l, 1l, 5l);
  }

}
