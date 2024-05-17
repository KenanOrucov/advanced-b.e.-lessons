package lesson3.factory;

public class Main {

    public static void main(String[] args) {

        var university = Factory.getUniversity("BANM");
        System.out.println(university);

        var university2 = Factory.getUniversity("ASOIU");
        System.out.println(university2);
    }
}
