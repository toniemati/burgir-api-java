package com.burgir.car;

import java.util.List;

public class CarConfig {

  public static List<Car> get() {
    Car c1 = new Car("STA 12345",
        false,
        95000);

    Car c2 = new Car("SY 12345",
        false,
        134000);

    Car c3 = new Car("SK 12345",
        false,
        44000);

    return List.of(c1, c2, c3);
  }
}
