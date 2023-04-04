package com.burgir.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CategoryService {

  @Autowired
  private CategoryRepository categoryRepository;

  public List<Category> index() {
    return this.categoryRepository.findAll();
  }

  public Category store(Category category) {
    return this.categoryRepository.save(category);
  }

  public Category show(Long id) {
    boolean exists = this.categoryRepository.existsById(id);

    if (!exists) {
      throw new IllegalStateException("Category with ID: " + id + " does not exist!");
    }

    return this.categoryRepository.findById(id).get();
  }

  @Transactional
  public Category update(Long id, String name, String description) {
    Category category = this.categoryRepository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Category with ID: " + id + " does not exist!"));

    if (name != null) {
      category.setName(name);
    }

    if (description != null) {
      category.setDescription(description);
    }

    return category;
  }

  public Category destroy(Long id) {
    boolean exists = this.categoryRepository.existsById(id);

    if (!exists) {
      new IllegalStateException("Category with ID: " + id + " does not exist!");
    }

    Category category = this.categoryRepository.findById(id).get();

    this.categoryRepository.deleteById(id);

    return category;
  }

}
