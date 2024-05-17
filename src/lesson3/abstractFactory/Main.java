package lesson3.abstractFactory;

public class Main {

    public static void main(String[] args) {

        var animalFactory = AbstractFactory.getFactory("Animal");
        var cow = animalFactory.create("cow");

        var colorFactory = AbstractFactory.getFactory("Color");
        var red = colorFactory.create("brown");

        System.out.println(cow);
        System.out.println(red);
    }
}
