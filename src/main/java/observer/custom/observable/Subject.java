package observer.custom.observable;

import observer.custom.observers.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}