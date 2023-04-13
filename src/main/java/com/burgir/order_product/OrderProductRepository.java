package com.burgir.order_product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {

  @Modifying
  @Query(value = "INSERT INTO order_product (id, order_id, product_id) VALUES (:id, :orderId, :productId)", nativeQuery = true)
  @Transactional
  void addProduct(
      @Param("id") Long id,
      @Param("orderId") Long orderId,
      @Param("productId") Long productId);

}
