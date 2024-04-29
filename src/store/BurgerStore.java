package store;

import java.util.ArrayList;
import java.util.List;

public class BurgerStore implements Subject {
    List<Observer> observers = new ArrayList<>();
    String newestBurgerType;

    public void setBurgerType(String burgerType) {
        newestBurgerType = burgerType;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer e) {
        observers.add(e);
    }

    @Override
    public void removeObserver(Observer e) {
        observers.remove(e);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(newestBurgerType);
        }
    }
}
