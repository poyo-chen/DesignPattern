package strategy;

import org.junit.jupiter.api.Test;
import strategy.behavior.FlyRocketPowered;
import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.ModelDuck;

public class MiniDuckSimulatorTest {

  @Test
  void TestMallardDuck() {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
  }

  @Test
  void TestModelDuck() {
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }


}
