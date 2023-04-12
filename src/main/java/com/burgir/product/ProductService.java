package com.burgir.product;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> index() {
    return this.productRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
  }

  public Product store(Product product) {
    return this.productRepository.save(product);
  }

  public Product show(Long id) {
    boolean exists = this.productRepository.existsById(id);

    if (!exists) {
      throw new IllegalStateException("Product with ID: " + id + " does not exist!");
    }

    return this.productRepository.findById(id).get();
  }

  @Transactional
  public Product update(Long id, String name) {
    Product product = this.productRepository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Product with ID: " + id + " does not exist!"));

    if (name != null) {
      product.setName(name);
    }

    return product;
  }

  public Product destroy(Long id) {
    boolean exists = this.productRepository.existsById(id);

    if (!exists) {
      new IllegalStateException("Product with ID: " + id + " does not exist!");
    }

    Product product = this.productRepository.findById(id).get();

    this.productRepository.deleteById(id);

    return product;
  }

}
