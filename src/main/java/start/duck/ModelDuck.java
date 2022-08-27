package start.duck;

import start.behavior.FlyNoWay;
import start.behavior.Quack;

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
