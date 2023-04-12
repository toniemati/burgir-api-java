package com.burgir.ingredient_product;

public class IngredientProductConfig {

  public static void addIngredients(IngredientProductRepository ingredientProductRepository) {
    Long id = 1l;
    // ! Burgir
    ingredientProductRepository.addIngredient(id++, 5l, 1l);
    ingredientProductRepository.addIngredient(id++, 5l, 3l);
    ingredientProductRepository.addIngredient(id++, 5l, 5l);
    ingredientProductRepository.addIngredient(id++, 5l, 9l);
    ingredientProductRepository.addIngredient(id++, 5l, 11l);
    ingredientProductRepository.addIngredient(id++, 5l, 15l);
    ingredientProductRepository.addIngredient(id++, 5l, 16l);
    ingredientProductRepository.addIngredient(id++, 5l, 17l);
    ingredientProductRepository.addIngredient(id++, 5l, 18l);

    // ! Cheeser
    ingredientProductRepository.addIngredient(id++, 6l, 1l);
    ingredientProductRepository.addIngredient(id++, 6l, 3l);
    ingredientProductRepository.addIngredient(id++, 6l, 8l);
    ingredientProductRepository.addIngredient(id++, 6l, 9l);
    ingredientProductRepository.addIngredient(id++, 6l, 10l);
    ingredientProductRepository.addIngredient(id++, 6l, 11l);
    ingredientProductRepository.addIngredient(id++, 6l, 12l);
    ingredientProductRepository.addIngredient(id++, 6l, 19l);

    // ! Hottuwa
    ingredientProductRepository.addIngredient(id++, 7l, 1l);
    ingredientProductRepository.addIngredient(id++, 7l, 3l);
    ingredientProductRepository.addIngredient(id++, 7l, 11l);
    ingredientProductRepository.addIngredient(id++, 7l, 12l);
    ingredientProductRepository.addIngredient(id++, 7l, 16l);
    ingredientProductRepository.addIngredient(id++, 7l, 20l);

    // ! Kurczaker
    ingredientProductRepository.addIngredient(id++, 8l, 1l);
    ingredientProductRepository.addIngredient(id++, 8l, 2l);
    ingredientProductRepository.addIngredient(id++, 8l, 5l);
    ingredientProductRepository.addIngredient(id++, 8l, 12l);
    ingredientProductRepository.addIngredient(id++, 8l, 21l);

    // ! Veggie
    ingredientProductRepository.addIngredient(id++, 9l, 1l);
    ingredientProductRepository.addIngredient(id++, 9l, 4l);
    ingredientProductRepository.addIngredient(id++, 9l, 11l);
    ingredientProductRepository.addIngredient(id++, 9l, 12l);
    ingredientProductRepository.addIngredient(id++, 9l, 18l);
    ingredientProductRepository.addIngredient(id++, 9l, 22l);
    ingredientProductRepository.addIngredient(id++, 9l, 23l);
  }

}
