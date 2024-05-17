package lesson3.abstractFactory;

public class AnimalFactory implements Factory {

    @Override
    public String create(String animal) {
        if ("cow".equalsIgnoreCase(animal)) {
            return new Cow().speak();
        } else if ("dog".equalsIgnoreCase(animal)) {
            return new Dog().speak();
        }
        return null;
    }
}
