package main.java.data_structures.root;

/**
 * Represents root of all data structures with an array implementation
 * @param <T> type of data that should be stored
 */
public abstract class ArrayStructure<T> {
    private int size;
    private Object[] array;

    public ArrayStructure() {
        size = 3;
        array = new Object[size];
    }

    public int size() { return size; }

    public void at(int index) {

    }

    protected abstract void setSize(int size);
}
