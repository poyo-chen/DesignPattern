package strategy.behavior;

public class FlyRocketPowered implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("flying with rocket!");
  }
}
