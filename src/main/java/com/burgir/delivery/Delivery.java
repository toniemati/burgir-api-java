package com.burgir.delivery;

import com.burgir.car.Car;
import com.burgir.employee.Employee;
import com.burgir.orders.Order;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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

  @OneToOne
  @JoinColumn(name = "orderId", referencedColumnName = "id", insertable = false, updatable = false)
  @JsonIgnore
  private Order order;

  @ManyToOne
  @JoinColumn(name = "employeeId", insertable = false, updatable = false)
  private Employee employee;

  @ManyToOne
  @JoinColumn(name = "carId", insertable = false, updatable = false)
  private Car car;

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

  public Employee getEmployee() {
    return this.employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Car getCar() {
    return this.car;
  }

  public void setCar(Car car) {
    this.car = car;
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
