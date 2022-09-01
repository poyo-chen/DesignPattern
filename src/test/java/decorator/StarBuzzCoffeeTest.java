package decorator;

import decorator.condiment.Mocha;
import decorator.condiment.Soy;
import decorator.condiment.Whip;
import decorator.drinks.Beverage;
import decorator.drinks.DarkRoast;
import decorator.drinks.Espresso;
import decorator.drinks.HouseBlend;
import org.junit.jupiter.api.Test;

public class StarBuzzCoffeeTest {

  @Test
  void testEspresso() {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
  }

  @Test
  void testDarkRoast() {
    Beverage beverage = new DarkRoast();
    beverage=new Mocha(beverage);
    beverage=new Mocha(beverage);
    beverage=new Whip(beverage);
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
  }

  @Test
  void testHouseBlend() {
    Beverage beverage = new HouseBlend();
    beverage=new Soy(beverage);
    beverage=new Mocha(beverage);
    beverage=new Whip(beverage);
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
  }
}
