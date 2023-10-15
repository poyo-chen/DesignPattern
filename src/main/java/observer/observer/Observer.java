package observer.observer;

public interface Observer {

  @Deprecated
  void update(final float temp, final float humidity, final float pressure);

  void update();
}
