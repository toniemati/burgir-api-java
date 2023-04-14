package com.burgir.category;

import java.util.LinkedList;
import java.util.List;

public class CategoryConfig {

  public static List<Category> get() {
    LinkedList<Category> categories = new LinkedList<>();

    categories.add(new Category("Burgery", "Przepyszne hamburgery 🍔"));

    categories.add(new Category("Dodatki", "Najlepsze dodatki 🍟"));

    categories.add(new Category("Sosy", "Sosy jakich jeszcze nie jadłeś 🍛"));

    categories.add(new Category("Napoje", "Orzeźwiające napoje 🧃"));

    return categories;
  }

}
