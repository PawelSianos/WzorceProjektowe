package Wzorce.projektowe.observer.Weather;

import Wzorce.projektowe.observer.notyfication.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
