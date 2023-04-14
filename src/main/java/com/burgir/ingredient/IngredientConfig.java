package com.burgir.ingredient;

import java.util.LinkedList;
import java.util.List;

public class IngredientConfig {

  public static List<Ingredient> get() {
    LinkedList<Ingredient> ingredients = new LinkedList<>();

    ingredients.add(new Ingredient( // * 1
        "Bułka",
        "Świeża bułeczka wypiekana u nas w lokalu"));

    ingredients.add(new Ingredient( // * 2
        "Kotlet z kurczaka",
        "Najlepszy kotlecik z kurczaka jaki jadłeś"));

    ingredients.add(new Ingredient( // * 3
        "Kotlet wołowy",
        "Mięsko wołowe pierwszej klasy, pyszne i soczyste"));

    ingredients.add(new Ingredient( // * 4
        "Kotlet vege",
        "Niby vege a smakuje jak najlepsze mięsko"));

    ingredients.add(new Ingredient( // * 5
        "Plasterki bekonu",
        "Chrupiące i pysznitukie plasterki boczku"));

    ingredients.add(new Ingredient( // * 6
        "Placek ziemniaczany",
        "Lubie placki"));

    ingredients.add(new Ingredient( // * 7
        "Prażona cebulka",
        "Mmm chrupiące"));

    ingredients.add(new Ingredient( // * 8
        "Ser camembert",
        "Tłuściutki serek"));

    ingredients.add(new Ingredient( // * 9
        "Ser cheddar",
        "Pyszny serek cheddar"));

    ingredients.add(new Ingredient( // * 10
        "Ser mozzarella",
        "Oczywiście sama woda, tą białą kulke wyrzucamy"));

    ingredients.add(new Ingredient( // * 11
        "Pomidor",
        "Świeżutkie pomidorki"));

    ingredients.add(new Ingredient( // * 12
        "Sałata",
        "Świeżutka sałata"));

    ingredients.add(new Ingredient( // * 13
        "Ogórki kiszone",
        "Najlepsze ogórki kiszone z naszego kraju"));

    ingredients.add(new Ingredient( // * 14
        "Pieczarki",
        "Coś dla grzybiarzy"));

    ingredients.add(new Ingredient( // * 15
        "Rukola",
        "Prawie sałata ale zdrowsza"));

    ingredients.add(new Ingredient( // * 16
        "Ostre papryczki",
        "Ostre ale nie aż tak, żeby niezjeść"));

    ingredients.add(new Ingredient( // * 17
        "Sosik BBQ",
        "Sosik BBQ"));

    ingredients.add(new Ingredient( // * 18
        "Czerwona cebulka",
        "Bo w końcu jesteśmy Polakami"));

    ingredients.add(new Ingredient( // * 19
        "Cebula",
        "Bo w końcu jesteśmy Polakami"));

    ingredients.add(new Ingredient( // * 20
        "Sosik ultra ostry",
        "Fiu fiu"));

    ingredients.add(new Ingredient( // * 21
        "Sosik majonezowy",
        "Just mayo"));

    ingredients.add(new Ingredient( // * 22
        "Ogórek zielony",
        "zielony ogórek"));

    ingredients.add(new Ingredient( // * 23
        "Sos burgerowy",
        "Najlepszy sosik do hamburgera"));

    return ingredients;
  }

}
