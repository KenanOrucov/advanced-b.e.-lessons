package lesson4.decorator;

public class AdditionThreeComponentUser extends Decorator{

    public AdditionThreeComponentUser(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        featureThree();
    }

    public void featureThree() {
        System.out.println("This is our third feature");
    }
}
