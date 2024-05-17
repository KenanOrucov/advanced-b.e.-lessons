package lesson2.solid.i.good;

public class Bird implements Flyable, Eatable {

    public void eat() {
        System.out.println("eating");
    }

    public void fly() {
        System.out.println("flying");
    }
}
