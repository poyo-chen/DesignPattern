package start.behavior;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("quack");
  }
}
