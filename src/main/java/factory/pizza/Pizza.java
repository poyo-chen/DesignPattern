package factory.pizza;

import factory.ingredient.Clams;
import factory.ingredient.Dough;
import factory.ingredient.Pepperoni;
import factory.ingredient.Sauce;
import factory.ingredient.Veggies;

public abstract class Pizza {

  String name;
  Dough dough;
  Sauce sauce;
  Veggies veggies[];
  Pepperoni pepperoni;
  Clams clams;
//  List<String> toppings = new ArrayList<>();

  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  //  改由材工廠取得
//  public void prepare() {
//    System.out.println("Preparing " + name);
//    System.out.println("Tossing dough...");
//    System.out.println("Adding topping...");
//    for (String topping : toppings) {
//      System.out.println("  " + topping);
//    }
//  }
  public abstract void prepare();

  public String getName() {
    return name;
  }
}
