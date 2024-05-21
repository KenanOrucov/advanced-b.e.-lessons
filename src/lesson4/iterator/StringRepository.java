package lesson4.iterator;

public class StringRepository implements Container {
    private String[] names;

    public StringRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator createIterator() {
        return new StringIterator(names);
    }
}
