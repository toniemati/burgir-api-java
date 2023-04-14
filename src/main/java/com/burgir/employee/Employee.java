package com.burgir.employee;

import java.time.LocalDateTime;
import java.util.Set;

import com.burgir.delivery.Delivery;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

  @Id
  @SequenceGenerator(name = "employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_sequence")
  private Long id;

  private String firstName;

  private String lastName;

  private Boolean bussy;

  private String title;

  private LocalDateTime hireDate = LocalDateTime.now();

  private Double salary;

  @Column(columnDefinition = "text")
  private String address;

  @OneToMany(mappedBy = "employee")
  @JsonIgnore
  private Set<Delivery> deliveries;

  public Employee() {
  }

  public Employee(
      String firstName,
      String lastName,
      Boolean bussy,
      String title,
      LocalDateTime hireDate,
      Double salary,
      String address) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.bussy = bussy;
    this.title = title;
    this.hireDate = hireDate;
    this.salary = salary;
    this.address = address;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getfirstName() {
    return this.firstName;
  }

  public void setfirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getlastName() {
    return this.lastName;
  }

  public void setlastName(String lastName) {
    this.lastName = lastName;
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

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDateTime gethireDate() {
    return this.hireDate;
  }

  public void sethireDate(LocalDateTime hireDate) {
    this.hireDate = hireDate;
  }

  public Double getSalary() {
    return this.salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", firstName='" + getfirstName() + "'" +
        ", lastName='" + getlastName() + "'" +
        ", bussy='" + isBussy() + "'" +
        ", title='" + getTitle() + "'" +
        ", hireDate='" + gethireDate() + "'" +
        ", salary='" + getSalary() + "'" +
        ", address='" + getAddress() + "'" +
        "}";
  }

}
