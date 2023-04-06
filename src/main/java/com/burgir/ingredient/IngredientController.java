package com.burgir.ingredient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.burgir.BurgirController;

@RestController
public class IngredientController extends BurgirController {

  @Autowired
  private IngredientService ingredientService;

  @GetMapping("/ingredient")
  public List<Ingredient> index() {
    return this.ingredientService.index();
  }

  @PostMapping("/ingredient")
  public Ingredient store(@RequestBody Ingredient ingredient) {
    return this.ingredientService.store(ingredient);
  }

  @GetMapping("/ingredient/{id}")
  public Ingredient show(@PathVariable Long id) {
    return this.ingredientService.show(id);
  }

  @PutMapping("/ingredient/{id}")
  public Ingredient update(
      @PathVariable Long id,
      @RequestParam(required = false) String name,
      @RequestParam(required = false) String description) {

    return this.ingredientService.update(id, name, description);
  }

  @DeleteMapping("/ingredient/{id}")
  public Ingredient destroy(@PathVariable Long id) {
    return this.ingredientService.destroy(id);
  }

}
