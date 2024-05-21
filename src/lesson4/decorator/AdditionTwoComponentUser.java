package lesson4.decorator;

public class AdditionTwoComponentUser extends Decorator{

    public AdditionTwoComponentUser(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        featureTwo();
    }

    private void featureTwo() {
        System.out.println("This is our second feature");
    }
}
