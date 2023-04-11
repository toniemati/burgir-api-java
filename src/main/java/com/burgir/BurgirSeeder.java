package com.burgir;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

public class BurgirSeeder {

  @EventListener
  public void seed(ContextRefreshedEvent event) {
    System.out.println("SEEDER");
  }
}
