package solid.d.good;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine(), "red");
        car.start();
    }
}
