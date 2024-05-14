package solid.d.bad;

public class Main {

    public static void main(String[] args) {

        MasterCard masterCard = new MasterCard("123456789", "01/01/2020");
        User user = new User("John Doe", "Software Engineer", masterCard);

        System.out.println(user);
    }
}
