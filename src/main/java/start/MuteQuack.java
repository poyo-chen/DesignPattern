package start;

import strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

  public void quack() {
    System.out.println("<< Silence >>");
  }
}
