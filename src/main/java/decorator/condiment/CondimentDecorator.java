package decorator.condiment;

import decorator.drinks.Beverage;

public abstract class CondimentDecorator extends Beverage {

  Beverage beverage;

  public abstract String getDescription();

  public Size getSize() {
    return beverage.getSize();
  }
}
