package start;

import strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

  public void quack() {
    System.out.println("Squeak");
  }
}
