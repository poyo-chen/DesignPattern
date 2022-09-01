package decorator.condiment;

import decorator.drinks.Beverage;

public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return beverage.cost() + .30;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}
