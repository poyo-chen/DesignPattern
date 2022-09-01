package factory;

public class PizzaStore {

  SinglePizzaFactory factory;

  public PizzaStore(SinglePizzaFactory factory) {
    this.factory = factory;
  }

  Pizza orderPizza(String type) {
//    Pizza pizza=new Pizza();  現在必須依照種類生成正確的Pizza

//    隨著品項的修改、這段程式碼會經常被異動，使用SinglePizzaFactory處理
//    if (type.equals("cheese")) {
//      pizza = new CheesePizza();
//    } else if (type.equals("greek")) {
//      pizza = new GreekPizza();
//    } else if (type.equals("pepperoni")) {
//      pizza = new PepperoniPizza();
//    }
    Pizza pizza;
    pizza = factory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
