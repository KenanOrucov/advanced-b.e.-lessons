package lesson4.decorator;

public abstract class Decorator implements Component {
    public Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
