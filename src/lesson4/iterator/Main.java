package lesson4.iterator;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[]{"John", "Jane"};
        var container = new StringRepository(names);
        var iterator = container.createIterator();

        while (iterator.hasNext()) {
            var name = iterator.next();
            System.out.println(name);
        }
    }
}
