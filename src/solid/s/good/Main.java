package solid.s.good;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("Apple", "MacBook", 1000L);
        Computer computer2 = new Computer("Samsung", "Notebook", 2000L);
        System.out.println(computer2);
        System.out.println(computer);
    }
}
