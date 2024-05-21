package lesson4.iterator;

public class StringIterator implements Iterator {
    private String[] names;
    private int index;

    public StringIterator(String[] names) {
        this.names = names;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index< names.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return names[index++];
        }
        return null;
    }
}
