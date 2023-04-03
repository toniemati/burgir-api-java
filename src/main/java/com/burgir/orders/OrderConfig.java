package com.burgir.orders;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

  @Bean
  CommandLineRunner orderRunner(OrderRepository repository) {
    return args -> {
      Order o1 = new Order(LocalDateTime.of(LocalDate.of(2023, Month.MARCH, 30), LocalTime.of(15, 51, 21)), 1l);

      Order o2 = new Order(LocalDateTime.of(LocalDate.of(2023, Month.MARCH, 31), LocalTime.of(16, 49, 59)), 1l);

      Order o3 = new Order(LocalDateTime.of(LocalDate.of(2023, Month.MARCH, 31), LocalTime.of(14, 33, 44)), 2l);

      repository.saveAll(List.of(o1, o2, o3));
    };
  }

}
