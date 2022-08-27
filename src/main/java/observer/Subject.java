package observer;

public interface Subject {

  void registerObserver(final Observer o);

  void removeObserver(final Observer o);

  void notifyObservers();
}
