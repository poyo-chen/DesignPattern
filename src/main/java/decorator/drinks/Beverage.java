package decorator.drinks;

public abstract class Beverage {

  public enum Size {TALL, GRAND, VENTI}

  Size size = Size.TALL;

  String description = "UnKnown Beverage ";

  public String getDescription() {
    return description;
  }

  public Size getSize() {
    return size;
  }

  public void setSize(Size size) {
    this.size = size;
  }

  public abstract double cost();
}
