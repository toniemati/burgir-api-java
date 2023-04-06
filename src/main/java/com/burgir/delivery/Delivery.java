package com.burgir.delivery;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "deliveries")
public class Delivery {

  @Id
  @SequenceGenerator(name = "delivery_sequence", sequenceName = "delivery_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "delivery_sequence")
  private Long id;

  private Double distance;

  private Boolean delivered;

  private Long orderId;

  private Long employeeId;

  private Long carId;

  public Delivery() {

  }

  public Delivery(Double distance, Boolean delivered, Long orderId, Long employeeId, Long carId) {
    this.distance = distance;
    this.delivered = delivered;
    this.orderId = orderId;
    this.employeeId = employeeId;
    this.carId = carId;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getDistance() {
    return this.distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public Boolean isDelivered() {
    return this.delivered;
  }

  public Boolean getDelivered() {
    return this.delivered;
  }

  public void setDelivered(Boolean delivered) {
    this.delivered = delivered;
  }

  public Long getOrderId() {
    return this.orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Long getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }

  public Long getCarId() {
    return this.carId;
  }

  public void setCarId(Long carId) {
    this.carId = carId;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", distance='" + getDistance() + "'" +
        ", delivered='" + isDelivered() + "'" +
        ", orderId='" + getOrderId() + "'" +
        ", employeeId='" + getEmployeeId() + "'" +
        ", carId='" + getCarId() + "'" +
        "}";
  }

}
