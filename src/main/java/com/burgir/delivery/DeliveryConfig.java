package com.burgir.delivery;

import java.util.LinkedList;
import java.util.List;

import com.burgir.car.Car;
import com.burgir.car.CarRepository;
import com.burgir.orders.Order;
import com.burgir.orders.OrderRepository;
import com.github.javafaker.Faker;

public class DeliveryConfig {

  public static LinkedList<Delivery> get(OrderRepository orderRepository, CarRepository carRepository) {
    List<Order> orders = orderRepository.findAll();
    List<Car> cars = carRepository.findAll();
    Faker faker = new Faker();

    LinkedList<Delivery> deliveries = new LinkedList<Delivery>();

    for (Order o : orders) {
      Double distance = faker.number().randomDouble(2, 1, 50);
      Long employeeId = 1l;
      Car car = cars.get(faker.number().numberBetween(0, cars.size()));

      car.setMileage(Math.round(car.getMileage() + distance));
      carRepository.save(car);

      Delivery d = new Delivery(distance, true, o.getId(), employeeId, car.getId());

      deliveries.add(d);
    }

    return deliveries;
  }

}
