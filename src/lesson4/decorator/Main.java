package lesson4.decorator;

public class Main {

    public static void main(String[] args) {
        var component = new ComponentUser();
        var additionOneComponentUser = new AdditionOneComponentUser(component);
        var additionTwoComponentUser = new AdditionTwoComponentUser(additionOneComponentUser);
        var additionThreeComponentUser = new AdditionThreeComponentUser(additionTwoComponentUser);

        additionThreeComponentUser.operation();
    }
}
