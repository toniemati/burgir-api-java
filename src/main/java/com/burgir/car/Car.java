package com.burgir.car;

import java.util.Set;

import com.burgir.delivery.Delivery;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

  @Id
  @SequenceGenerator(name = "car_sequence", sequenceName = "car_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_sequence")
  private Long id;

  private String plates;

  private Boolean bussy;

  private double mileage;

  @OneToMany(mappedBy = "car")
  private Set<Delivery> deliveries;

  public Car() {

  }

  public Car(String plates, Boolean bussy, double mileage) {
    this.plates = plates;
    this.bussy = bussy;
    this.mileage = mileage;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPlates() {
    return this.plates;
  }

  public void setPlates(String plates) {
    this.plates = plates;
  }

  public Boolean isBussy() {
    return this.bussy;
  }

  public Boolean getBussy() {
    return this.bussy;
  }

  public void setBussy(Boolean bussy) {
    this.bussy = bussy;
  }

  public double getMileage() {
    return this.mileage;
  }

  public void setMileage(double mileage) {
    this.mileage = mileage;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", plates='" + getPlates() + "'" +
        ", bussy='" + isBussy() + "'" +
        ", mileage='" + getMileage() + "'" +
        "}";
  }
}
