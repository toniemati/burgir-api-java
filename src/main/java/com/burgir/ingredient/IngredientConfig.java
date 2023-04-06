package com.burgir.ingredient;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IngredientConfig {

  @Bean
  CommandLineRunner ingredientRunner(IngredientRepository repository) {
    return args -> {
      Ingredient i1 = new Ingredient( // * 1
          "Bułka",
          "Świeża bułeczka wypiekana u nas w lokalu");

      Ingredient i2 = new Ingredient( // * 2
          "Kotlet z kurczaka",
          "Najlepszy kotlecik z kurczaka jaki jadłeś");

      Ingredient i3 = new Ingredient( // * 3
          "Kotlet wołowy",
          "Mięsko wołowe pierwszej klasy, pyszne i soczyste");

      Ingredient i4 = new Ingredient( // * 4
          "Kotlet vege",
          "Niby vege a smakuje jak najlepsze mięsko");

      Ingredient i5 = new Ingredient( // * 5
          "Plasterki bekonu",
          "Chrupiące i pysznitukie plasterki boczku");

      Ingredient i6 = new Ingredient( // * 6
          "Placek ziemniaczany",
          "Lubie placki");

      Ingredient i7 = new Ingredient( // * 7
          "Prażona cebulka",
          "Mmm chrupiące");

      Ingredient i8 = new Ingredient( // * 8
          "Ser camembert",
          "Tłuściutki serek");

      Ingredient i9 = new Ingredient( // * 9
          "Ser cheddar",
          "Pyszny serek cheddar");

      Ingredient i10 = new Ingredient( // * 10
          "Ser mozzarella",
          "Oczywiście sama woda, tą białą kulke wyrzucamy");

      Ingredient i11 = new Ingredient( // * 11
          "Pomidor",
          "Świeżutkie pomidorki");

      Ingredient i12 = new Ingredient( // * 12
          "Sałata",
          "Świeżutka sałata");

      Ingredient i13 = new Ingredient( // * 13
          "Ogórki kiszone",
          "Najlepsze ogórki kiszone z naszego kraju");

      Ingredient i14 = new Ingredient( // * 14
          "Pieczarki",
          "Coś dla grzybiarzy");

      Ingredient i15 = new Ingredient( // * 15
          "Rukola",
          "Prawie sałata ale zdrowsza");

      Ingredient i16 = new Ingredient( // * 16
          "Ostre papryczki",
          "Ostre ale nie aż tak, żeby niezjeść");

      Ingredient i17 = new Ingredient( // * 17
          "Sosik BBQ",
          "Sosik BBQ");

      Ingredient i18 = new Ingredient( // * 18
          "Czerwona cebulka",
          "Bo w końcu jesteśmy Polakami");

      Ingredient i19 = new Ingredient( // * 19
          "Cebula",
          "Bo w końcu jesteśmy Polakami");

      Ingredient i20 = new Ingredient( // * 20
          "Sosik ultra ostry",
          "Fiu fiu");

      Ingredient i21 = new Ingredient( // * 21
          "Sosik majonezowy",
          "Just mayo");

      Ingredient i22 = new Ingredient( // * 22
          "Ogórek zielony",
          "zielony ogórek");

      Ingredient i23 = new Ingredient( // * 23
          "Sos burgerowy",
          "Najlepszy sosik do hamburgera");

      repository.saveAll(List.of(
          i1,
          i2,
          i3,
          i4,
          i5,
          i6,
          i7,
          i8,
          i9,
          i10,
          i11,
          i12,
          i13,
          i14,
          i15,
          i16,
          i17,
          i18,
          i19,
          i20,
          i21,
          i22,
          i23));
    };
  }

}
