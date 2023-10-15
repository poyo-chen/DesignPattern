package factory.store;

import factory.pizza.ChicagoStyleCheesePizza;
import factory.pizza.ChicagoStyleGreekPizza;
import factory.pizza.ChicagoStylePepperoniPizza;
import factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

  @Override
  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new ChicagoStyleCheesePizza();
    } else if (type.equals("greek")) {
      return new ChicagoStyleGreekPizza();
    } else if (type.equals("pepperoni")) {
      return new ChicagoStylePepperoniPizza();
    }
    return null;
  }
}
