package solid.o.good;

public class BMW implements Car {
    @Override
    public void goWith(String brand) {
        System.out.println("I am driving with BMW");
    }
}
