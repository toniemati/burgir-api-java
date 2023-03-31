package com.burgir.orders;

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
public class OrderController extends BurgirController {

  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @GetMapping("/order")
  public List<Order> index() {
    return this.orderService.index();
  }

  @PostMapping("/order")
  public Order store(@RequestBody Order Order) {
    return this.orderService.store(Order);
  }

  @GetMapping("/order/{id}")
  public Order show(@PathVariable("id") Long id) {
    return this.orderService.show(id);
  }

  @PutMapping("/order/{id}")
  public Order update(
      @PathVariable("id") Long id,
      @RequestParam(required = false) Long customerId) {

    return this.orderService.update(id, customerId);
  }

  @DeleteMapping("/order/{id}")
  public Order destroy(@PathVariable("id") Long id) {
    return this.orderService.destroy(id);
  }

}
