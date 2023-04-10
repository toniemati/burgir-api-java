package com.burgir.car;

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
public class CarController extends BurgirController {

  @Autowired
  private CarService carService;

  @GetMapping("/car")
  public List<Car> index() {
    return this.carService.index();
  }

  @PostMapping("/car")
  public Car store(@RequestBody Car car) {
    return this.carService.store(car);
  }

  @GetMapping("/car/{id}")
  public Car show(@PathVariable("id") Long id) {
    return this.carService.show(id);
  }

  @PutMapping("/car/{id}")
  public Car update(
      @PathVariable("id") Long id,
      @RequestParam(required = false) String plates,
      @RequestParam(required = false) Boolean bussy,
      @RequestParam(required = false) Double mileage) {

    return this.carService.update(id, plates, bussy, mileage);
  }

  @DeleteMapping("/car/{id}")
  public Car destroy(@PathVariable("id") Long id) {
    return this.carService.destroy(id);
  }

}
