package com.burgir.car;

import java.util.LinkedList;
import java.util.List;

public class CarConfig {

  public static List<Car> get() {
    LinkedList<Car> cars = new LinkedList<>();

    cars.add(new Car("STA 12345",
        false,
        95000));

    cars.add(new Car("SY 12345",
        false,
        134000));

    cars.add(new Car("SK 12345",
        false,
        44000));

    return cars;
  }

}
