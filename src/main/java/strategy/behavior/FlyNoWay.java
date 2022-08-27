package strategy.behavior;

public class FlyNoWay implements FlyBehavior{

  @Override
  public void fly() {
    System.out.println("cant fly");
  }
}
