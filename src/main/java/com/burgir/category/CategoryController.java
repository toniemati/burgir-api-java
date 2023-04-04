package com.burgir.category;

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
public class CategoryController extends BurgirController {

  @Autowired
  private CategoryService categoryService;

  @GetMapping("/category")
  public List<Category> index() {
    return this.categoryService.index();
  }

  @PostMapping("/category")
  public Category store(@RequestBody Category category) {
    return this.categoryService.store(category);
  }

  @GetMapping("/category/{id}")
  public Category show(@PathVariable Long id) {
    return this.categoryService.show(id);
  }

  @PutMapping("/category/{id}")
  public Category update(
      @PathVariable Long id,
      @RequestParam(required = false) String name,
      @RequestParam(required = false) String description) {

    return this.categoryService.update(id, name, description);
  }

  @DeleteMapping("/category/{id}")
  public Category destroy(@PathVariable Long id) {
    return this.categoryService.destroy(id);
  }

}
