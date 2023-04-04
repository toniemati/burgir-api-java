package com.burgir.product;

import java.util.List;

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
public class ProductController extends BurgirController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/product")
  public List<Product> index() {
    return this.productService.index();
  }

  @PostMapping("/product")
  public Product store(@RequestBody Product product) {
    return this.productService.store(product);
  }

  @GetMapping("/product/{id}")
  public Product show(@PathVariable Long id) {
    return this.productService.show(id);
  }

  @PutMapping("/product/{id}")
  public Product update(
      @PathVariable Long id,
      @RequestParam(required = false) String name) {

    return this.productService.update(id, name);
  }

  @DeleteMapping("/product/{id}")
  public Product destroy(@PathVariable Long id) {
    return this.productService.destroy(id);
  }

}
