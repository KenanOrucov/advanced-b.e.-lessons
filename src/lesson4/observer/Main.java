package lesson4.observer;

public class Main {

    public static void main(String[] args) {
        var realSubject = new RealSubject();
        var realObserver = new RealObserver();
        var realObserver2 = new RealObserver();

        realSubject.registerObserver(realObserver);
        realSubject.registerObserver(realObserver2);

        realSubject.notifyObservers();
        realSubject.removeObserver(realObserver2);
    }
}
