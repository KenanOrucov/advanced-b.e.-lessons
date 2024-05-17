package lesson3.abstractFactory;

public class AbstractFactory {

    public static Factory getFactory(String choice) {
        if ("Animal".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
