package com.burgir.delivery;

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
public class DeliveryController extends BurgirController {

  @Autowired
  private DeliveryService deliveryService;

  @GetMapping("/delivery")
  public List<Delivery> index() {
    return this.deliveryService.index();
  }

  @PostMapping("/delivery")
  public Delivery store(@RequestBody Delivery delivery) {
    return this.deliveryService.store(delivery);
  }

  @GetMapping("/delivery/{id}")
  public Delivery show(@PathVariable Long id) {
    return this.deliveryService.show(id);
  }

  @PutMapping("/delivery/{id}")
  public Delivery update(
      @PathVariable Long id,
      @RequestParam(required = false) Double distance,
      @RequestParam(required = false) Boolean delivered,
      @RequestParam(required = false) Long orderId,
      @RequestParam(required = false) Long employeeId,
      @RequestParam(required = false) Long carId) {

    return this.deliveryService.update(id, distance, delivered, orderId, employeeId, carId);
  }

  @DeleteMapping("/delivery/{id}")
  public Delivery destroy(@PathVariable Long id) {
    return this.deliveryService.destroy(id);
  }

}
