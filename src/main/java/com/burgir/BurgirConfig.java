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
import com.burgir.ingredient.IngredientConfig;
import com.burgir.ingredient.IngredientRepository;
import com.burgir.orders.OrderConfig;
import com.burgir.orders.OrderRepository;
import com.burgir.product.ProductConfig;
import com.burgir.product.ProductRepository;

@Configuration
public class BurgirConfig {

  @Bean
  CommandLineRunner categoryRunner(CategoryRepository repository) {
    return args -> {
      repository.saveAll(CategoryConfig.get());
    };
  }

  @Bean
  CommandLineRunner productRunner(ProductRepository repository) {
    return args -> {
      repository.saveAll(ProductConfig.get());
    };
  }

  @Bean
  CommandLineRunner ingredientRunner(IngredientRepository repository) {
    return args -> {
      repository.saveAll(IngredientConfig.get());
    };
  }

  @Bean
  CommandLineRunner ingredientProductRunner() {
    return args -> {
      System.out.println("ingredient_product_runner");
    };
  }

  @Bean
  CommandLineRunner carRunner(CarRepository carRepository) {
    return args -> {
      carRepository.saveAll(CarConfig.get());
    };
  }

  @Bean
  CommandLineRunner customerRunner(CustomerRepository repository) {
    return args -> {
      repository.saveAll(CustomerConfig.get());
    };
  }

  @Bean
  CommandLineRunner employeeRunner() {
    return args -> {
      System.out.println("employee_runner");
    };
  }

  @Bean
  CommandLineRunner orderRunner(OrderRepository repository, CustomerRepository customerRepository) {
    return args -> {
      repository.saveAll(OrderConfig.get(customerRepository));
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
