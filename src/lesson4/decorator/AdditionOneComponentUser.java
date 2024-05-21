package lesson4.decorator;

public class AdditionOneComponentUser extends Decorator{

    public AdditionOneComponentUser(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        featureOne();
    }

    private void featureOne() {
        System.out.println("This is our first feature");
    }
}
