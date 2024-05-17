package lesson3.builder;

public class Main {

    public static void main(String[] args) {

        var user = User.Builder.builder()
                .name("Kanan Orujov")
                .age(20)
                .address("Baku, Azerbaijan")
                .build();

        var user2 = User.Builder.builder()
                .name("Kanan Orujov2")
                .address("Baku, Azerbaijan222")
                .build();

        System.out.println(user);
        System.out.println(user2);
    }
}
