package store;

public interface Subject {
    void registerObserver(Observer e);

    void removeObserver(Observer e);

    void notifyObservers();


}
