package decorator.condiment;

import decorator.drinks.Beverage;

public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return beverage.cost() + .11;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}
