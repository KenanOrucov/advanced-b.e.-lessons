package lesson3.abstractFactory;

public class ColorFactory implements Factory {

    @Override
    public String create(String color) {
        if ("white".equals(color)) {
            return new WhiteColor().getColor();
        } else if ("brown".equals(color)) {
            return new BrownColor().getColor();
        }
        return null;
    }
}
