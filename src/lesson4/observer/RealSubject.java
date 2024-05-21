package lesson4.observer;

import java.util.ArrayList;
import java.util.List;

public class RealSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Observer: registered!");
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Observer: removed!");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
