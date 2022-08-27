package strategy.duck;

import strategy.behavior.FlyNoWay;
import strategy.behavior.Quack;

public class ModelDuck extends Duck {

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  void display() {
    System.out.println("I am a model duck.");
  }
}
