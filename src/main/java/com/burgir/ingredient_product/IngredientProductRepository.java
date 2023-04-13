package com.burgir.ingredient_product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface IngredientProductRepository extends JpaRepository<IngredientProduct, Long> {

  @Modifying
  @Query(value = "INSERT INTO ingredient_product (id, product_id, ingredient_id) VALUES (:id, :productId, :ingredientId)", nativeQuery = true)
  @Transactional
  void addIngredient(
      @Param("id") Long id,
      @Param("productId") Long productId,
      @Param("ingredientId") Long ingredientId);

}
