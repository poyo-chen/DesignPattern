package start.duck;

import start.behavior.FlyWithWings;
import start.behavior.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  void display() {
    System.out.println("綠頭鴨");
  }
}
