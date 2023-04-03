package com.burgir.orders;

import java.time.LocalDateTime;

import com.burgir.customer.Customer;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @SequenceGenerator(name = "order_sequence", sequenceName = "order_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
  private Long id;
  private LocalDateTime orderDate;
  private Long customerId;
  @ManyToOne
  @JoinColumn(name = "customerId", insertable = false, updatable = false)
  @JsonIgnore
  private Customer customer;

  public Order() {

  }

  public Order(LocalDateTime orderDate, Long customerId) {
    this.orderDate = orderDate;
    this.customerId = customerId;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getOrderDate() {
    return this.orderDate;
  }

  public void setOrderDate(LocalDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public Long getCustomerId() {
    return this.customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public Customer getCustomer() {
    return this.customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", orderDate='" + getOrderDate() + "'" +
        ", customerId='" + getCustomerId() + "'" +
        ", customer='" + getCustomer() + "'" +
        "}";
  }

}
