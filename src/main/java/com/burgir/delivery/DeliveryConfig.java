package com.burgir.delivery;

import java.util.LinkedList;
import java.util.List;

import com.burgir.car.Car;
import com.burgir.car.CarRepository;
import com.burgir.employee.Employee;
import com.burgir.employee.EmployeeRepository;
import com.burgir.orders.Order;
import com.burgir.orders.OrderRepository;
import com.github.javafaker.Faker;

public class DeliveryConfig {

  public static LinkedList<Delivery> get(
      OrderRepository orderRepository,
      EmployeeRepository employeeRepository,
      CarRepository carRepository) {

    LinkedList<Delivery> deliveries = new LinkedList<Delivery>();
    Faker faker = new Faker();

    List<Order> orders = orderRepository.findAll();
    List<Employee> employees = employeeRepository.findAll();
    List<Car> cars = carRepository.findAll();

    for (Order o : orders) {
      Double distance = faker.number().randomDouble(2, 1, 50);
      Employee employee = employees.get(faker.number().numberBetween(0, employees.size()));
      Car car = cars.get(faker.number().numberBetween(0, cars.size()));

      car.setMileage(Math.round(car.getMileage() + distance));
      carRepository.save(car);

      Delivery d = new Delivery(distance, true, o.getId(), employee.getId(), car.getId());

      deliveries.add(d);
    }

    return deliveries;
  }

}
