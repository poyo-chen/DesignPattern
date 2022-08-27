package observer.subject;

import observer.observer.Observer;

public interface Subject {

  void registerObserver(final Observer o);

  void removeObserver(final Observer o);

  void notifyObservers();
}
