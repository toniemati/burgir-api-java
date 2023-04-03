package com.burgir.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

  @Id
  @SequenceGenerator(name = "customer_sequence", sequenceName = "customer_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sequence")
  private Long id;
  private String firstName;
  private String lastName;
  private String country;
  private String city;
  private String street;
  private String houseNumber;
  private String telephone;
  private String email;

  public Customer() {

  }

  public Customer(
      String firstName,
      String lastName,
      String country,
      String city,
      String street,
      String houseNumber,
      String telephone,
      String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.country = country;
    this.city = city;
    this.street = street;
    this.houseNumber = houseNumber;
    this.telephone = telephone;
    this.email = email;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return this.street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getHouseNumber() {
    return this.houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getTelephone() {
    return this.telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", firstName='" + getFirstName() + "'" +
        ", lastName='" + getLastName() + "'" +
        ", country='" + getCountry() + "'" +
        ", city='" + getCity() + "'" +
        ", street='" + getStreet() + "'" +
        ", houseNumber='" + getHouseNumber() + "'" +
        ", telephone='" + getTelephone() + "'" +
        ", email='" + getEmail() + "'" +
        "}";
  }

}
