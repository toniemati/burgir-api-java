package com.burgir.ingredient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class IngredientService {

  @Autowired
  private IngredientRepository ingredientRepository;

  public List<Ingredient> index() {
    return this.ingredientRepository.findAll();
  }

  public Ingredient store(Ingredient ingredient) {
    return this.ingredientRepository.save(ingredient);
  }

  public Ingredient show(Long id) {
    boolean exists = this.ingredientRepository.existsById(id);

    if (!exists) {
      throw new IllegalStateException("Ingredient with ID: " + id + " does not exist!");
    }

    return this.ingredientRepository.findById(id).get();
  }

  @Transactional
  public Ingredient update(Long id, String name, String description) {
    Ingredient ingredient = this.ingredientRepository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Ingredient with ID: " + id + " does not exist!"));

    if (name != null) {
      ingredient.setName(name);
    }

    if (description != null) {
      ingredient.setDescription(description);
    }

    return ingredient;
  }

  public Ingredient destroy(Long id) {
    boolean exists = this.ingredientRepository.existsById(id);

    if (!exists) {
      new IllegalStateException("Category with ID: " + id + " does not exist!");
    }

    Ingredient ingredient = this.ingredientRepository.findById(id).get();

    this.ingredientRepository.deleteById(id);

    return ingredient;
  }

}
