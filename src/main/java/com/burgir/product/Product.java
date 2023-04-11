package com.burgir.product;

import java.util.Set;

import com.burgir.category.Category;
import com.burgir.ingredient.Ingredient;
import com.burgir.orders.Order;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

  @Id
  @SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
  private Long id;

  private String name;

  @Column(columnDefinition = "text")
  private String img;

  @Column(columnDefinition = "text")
  private String description;

  private double price;

  private Long categoryId;

  @ManyToMany
  @JoinTable(name = "order_product", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "order_id"))
  @JsonBackReference
  private Set<Order> orders;

  @ManyToOne
  @JoinColumn(name = "categoryId", insertable = false, updatable = false)
  @JsonBackReference
  private Category category;

  @ManyToMany
  @JoinTable(name = "ingredient_product", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
  @JsonManagedReference
  private Set<Ingredient> ingredients;

  public Product() {

  }

  public Product(String name, String img, String description, double price, Long categoryId) {
    this.name = name;
    this.img = img;
    this.description = description;
    this.price = price;
    this.categoryId = categoryId;
  }

  /**
   * 
   * todo adding ingredient
   */
  public void addIngredient(Ingredient i) {
    this.setIngredients(Set.of(i));
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

  public String getImg() {
    return this.img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Long getCategoryId() {
    return this.categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public Category getCategory() {
    return this.category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Set<Ingredient> getIngredients() {
    return this.ingredients;
  }

  public void setIngredients(Set<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", name='" + getName() + "'" +
        ", img='" + getImg() + "'" +
        ", description='" + getDescription() + "'" +
        ", price='" + getPrice() + "'" +
        ", categoryId='" + getCategoryId() + "'" +
        "}";
  }
}