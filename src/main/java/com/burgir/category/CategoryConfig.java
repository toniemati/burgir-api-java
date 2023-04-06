package com.burgir.category;

import java.util.List;

public class CategoryConfig {

  public static List<Category> get() {
    Category c1 = new Category("Burgery", "Przepyszne hamburgery 🍔");

    Category c2 = new Category("Dodatki", "Najlepsze dodatki 🍟");

    Category c3 = new Category("Sosy", "Sosy jakich jeszcze nie jadłeś 🍛");

    Category c4 = new Category("Napoje", "Orzeźwiające napoje 🧃");

    return List.of(c1, c2, c3, c4);
  }

}
