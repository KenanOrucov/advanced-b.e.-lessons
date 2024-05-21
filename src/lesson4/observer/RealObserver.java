package lesson4.observer;

public class RealObserver implements Observer {
    @Override
    public void update() {
        System.out.println("RealObserver: updated!");
    }
}
