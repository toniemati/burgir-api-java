package com.burgir.ingredient_product;

import com.burgir.ingredient.Ingredient;
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
public class IngredientProduct {

  @Id
  @SequenceGenerator(name = "ingredient_product_sequence", sequenceName = "ingredient_product_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient_product_sequence")
  @JsonIgnore
  private Long id;

  @ManyToOne
  @JoinColumn(name = "ingredient_id")
  private Ingredient ingredient;

  @ManyToOne
  @JoinColumn(name = "product_id")
  @JsonIgnore
  private Product product;

  public IngredientProduct() {

  }

  public IngredientProduct(Ingredient ingredient, Product product) {
    this.ingredient = ingredient;
    this.product = product;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Ingredient getIngredient() {
    return this.ingredient;
  }

  public void setIngredient(Ingredient ingredient) {
    this.ingredient = ingredient;
  }

  public Product getProduct() {
    return this.product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", ingredient='" + getIngredient() + "'" +
        ", product='" + getProduct() + "'" +
        "}";
  }

}
