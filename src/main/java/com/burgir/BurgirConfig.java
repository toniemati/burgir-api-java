package com.burgir;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.burgir.car.CarConfig;
import com.burgir.car.CarRepository;
import com.burgir.category.CategoryConfig;
import com.burgir.category.CategoryRepository;
import com.burgir.customer.CustomerConfig;
import com.burgir.customer.CustomerRepository;
import com.burgir.delivery.DeliveryConfig;
import com.burgir.delivery.DeliveryRepository;
import com.burgir.employee.EmployeeConfig;
import com.burgir.employee.EmployeeRepository;
import com.burgir.ingredient.IngredientConfig;
import com.burgir.ingredient.IngredientRepository;
import com.burgir.ingredient_product.IngredientProductConfig;
import com.burgir.ingredient_product.IngredientProductRepository;
import com.burgir.orders.OrderConfig;
import com.burgir.orders.OrderRepository;
import com.burgir.product.ProductConfig;
import com.burgir.product.ProductRepository;

@Configuration
public class BurgirConfig {

  @Bean
  CommandLineRunner categoryRunner(CategoryRepository categoryRepository) {
    return args -> {
      categoryRepository.saveAll(CategoryConfig.get());
    };
  }

  @Bean
  CommandLineRunner productRunner(ProductRepository productRepository) {
    return args -> {
      productRepository.saveAll(ProductConfig.get());
    };
  }

  @Bean
  CommandLineRunner ingredientRunner(IngredientRepository ingredientRepository) {
    return args -> {
      ingredientRepository.saveAll(IngredientConfig.get());
    };
  }

  @Bean
  CommandLineRunner ingredientProductRunner(IngredientProductRepository ingredientProductRepository) {

    return args -> {
      IngredientProductConfig.addIngredients(ingredientProductRepository);
    };
  }

  @Bean
  CommandLineRunner carRunner(CarRepository carRepository) {
    return args -> {
      carRepository.saveAll(CarConfig.get());
    };
  }

  @Bean
  CommandLineRunner customerRunner(CustomerRepository customerRepository) {
    return args -> {
      customerRepository.saveAll(CustomerConfig.get());
    };
  }

  @Bean
  CommandLineRunner employeeRunner(EmployeeRepository employeeRepository) {
    return args -> {
      employeeRepository.saveAll(EmployeeConfig.get());
    };
  }

  @Bean
  CommandLineRunner orderRunner(
      OrderRepository orderRepository,
      CustomerRepository customerRepository) {

    return args -> {
      orderRepository.saveAll(OrderConfig.get(customerRepository));
    };
  }

  @Bean
  CommandLineRunner deliveryRunner(
      DeliveryRepository deliveryRepository,
      OrderRepository orderRepository,
      CarRepository carRepository) {

    return args -> {
      deliveryRepository.saveAll(DeliveryConfig.get(orderRepository, carRepository));
    };
  }

  @Bean
  CommandLineRunner orderProductRunner() {
    return args -> {
      System.out.println("order_product_runner");
    };
  }

}
