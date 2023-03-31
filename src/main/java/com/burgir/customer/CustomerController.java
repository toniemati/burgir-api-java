package com.burgir.customer;

import java.util.List;
import java.util.Map;

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
public class CustomerController extends BurgirController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/customer")
  public List<Customer> index() {
    return this.customerService.index();
  }

  @PostMapping("/customer")
  public Customer store(@RequestBody Customer customer) {
    return this.customerService.store(customer);
  }

  @GetMapping("/customer/{id}")
  public Customer show(@PathVariable("id") Long id) {
    return this.customerService.show(id);
  }

  @PutMapping("/customer/{id}")
  public Customer update(
      @PathVariable("id") Long id,
      @RequestParam Map<String, String> requestParams) {

    return this.customerService.update(id, requestParams);
  }

  @DeleteMapping("/customer/{id}")
  public Customer destroy(@PathVariable("id") Long id) {
    return this.customerService.destroy(id);
  }
}
