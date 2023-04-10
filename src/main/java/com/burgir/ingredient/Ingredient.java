package com.burgir.ingredient;

import java.util.Set;

import com.burgir.product.Product;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingredient {

  @Id
  @SequenceGenerator(name = "ingredient_sequence", sequenceName = "ingredient_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient_sequence")
  private Long id;

  private String name;

  @Column(columnDefinition = "text")
  private String description;

  @ManyToMany(mappedBy = "ingredients")
  @JsonBackReference
  private Set<Product> products;

  public Ingredient() {

  }

  public Ingredient(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Set<Product> getProducts() {
    return this.products;
  }

  public void setProducts(Set<Product> products) {
    this.products = products;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", name='" + getName() + "'" +
        ", description='" + getDescription() + "'" +
        "}";
  }

}
