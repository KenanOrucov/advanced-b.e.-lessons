package solid.d.good;

public class Car {
    private Engine engine;
    private String color;

    public Car(Engine engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    public void start() {
        engine.start();
    }
}
