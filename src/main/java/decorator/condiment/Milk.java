package decorator.condiment;

import decorator.drinks.Beverage;

public class Milk extends CondimentDecorator {

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    double cost = beverage.cost();
    switch (beverage.getSize()) {
      case TALL -> cost += .10;
      case GRAND -> cost += .15;
      case VENTI -> cost += .20;
    }
    return cost;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }
}
