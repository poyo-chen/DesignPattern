package factory.store;

import factory.pizza.CheesePizza;
import factory.pizza.GreekPizza;
import factory.pizza.NYStyleCheesePizza;
import factory.pizza.NYStyleGreekPizza;
import factory.pizza.NYStylePepperoniPizza;
import factory.pizza.PepperoniPizza;
import factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new NYStyleCheesePizza();
    } else if (type.equals("greek")) {
      return new NYStyleGreekPizza();
    } else if (type.equals("pepperoni")) {
      return new NYStylePepperoniPizza();
    }
    return null;
  }
}
