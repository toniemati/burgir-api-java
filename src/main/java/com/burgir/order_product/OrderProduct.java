package com.burgir.order_product;

import com.burgir.orders.Order;
import com.burgir.product.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class OrderProduct {

  @Id
  @SequenceGenerator(name = "order_product_sequence", sequenceName = "order_product_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_product_sequence")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;

  @ManyToOne
  @JoinColumn(name = "order_id")
  @JsonIgnore
  private Order order;

  public OrderProduct() {

  }

  public OrderProduct(Order order, Product product) {
    this.order = order;
    this.product = product;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Order getOrderId() {
    return this.order;
  }

  public void setOrderId(Order orderId) {
    this.order = orderId;
  }

  public Product getProductId() {
    return this.product;
  }

  public void setProductId(Product product) {
    this.product = product;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", orderId='" + getOrderId() + "'" +
        ", productId='" + getProductId() + "'" +
        "}";
  }

}
