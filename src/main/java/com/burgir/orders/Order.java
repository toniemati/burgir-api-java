package com.burgir.orders;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @SequenceGenerator(name = "order_sequence", sequenceName = "order_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
  private Long id;
  private LocalDate orderDate;
  private Long customerId;

  public Order() {

  }

  public Order(LocalDate orderDate, Long customerId) {
    this.orderDate = orderDate;
    this.customerId = customerId;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getOrderDate() {
    return this.orderDate;
  }

  public void setOrderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
  }

  public Long getCustomerId() {
    return this.customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", orderDate='" + getOrderDate() + "'" +
        ", customerId='" + getCustomerId() + "'" +
        "}";
  }

}
