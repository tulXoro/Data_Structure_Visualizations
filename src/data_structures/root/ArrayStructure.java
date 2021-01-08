package data_structures.root;

/**
 * Represents root of all data structures with an array implementation
 * @param <T> type of data that should be stored
 */
public class ArrayStructure<T> {
    private int size;
    private Object[] array;

    public ArrayStructure() {
        size = 5;
        array = new Object[size];
    }

    public int size() { return size; }
}
