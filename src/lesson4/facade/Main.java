package lesson4.facade;

public class Main {

    public static void main(String[] args) {
        var application = new ApplicationA();
        application.run();

        var application2 = new ApplicationB();
        application2.run();
    }
}
