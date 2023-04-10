package com.burgir.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CarService {

  @Autowired
  private CarRepository carRepository;

  public List<Car> index() {
    return this.carRepository.findAll();
  }

  public Car store(Car car) {
    return this.carRepository.save(car);
  }

  public Car show(Long id) {
    boolean exists = this.carRepository.existsById(id);

    if (!exists) {
      throw new IllegalStateException("Car with ID: " + id + " does not exist!");
    }

    return this.carRepository.findById(id).get();
  }

  @Transactional
  public Car update(Long id, String plates, Boolean bussy, Double mileage) {
    Car car = this.carRepository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Car with ID: " + id + " does not exist!"));

    if (plates != null) {
      car.setPlates(plates);
    }

    if (bussy != null) {
      car.setBussy(bussy);
    }

    if (mileage != null) {
      car.setMileage(mileage);
    }

    return car;
  }

  public Car destroy(Long id) {
    boolean exists = this.carRepository.existsById(id);

    if (!exists) {
      new IllegalStateException("Car with ID: " + id + " does not exist!");
    }

    Car car = this.carRepository.findById(id).get();

    this.carRepository.deleteById(id);

    return car;
  }
}
