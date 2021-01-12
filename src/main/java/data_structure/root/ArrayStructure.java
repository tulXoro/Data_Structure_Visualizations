package main.java.data_structure.root;

/**
 * Represents root of all data structures with an array implementation
 * @param <T> type of data that should be stored
 */
public abstract class ArrayStructure<T> {
    // The length of the array
    private int size;
    // Number of non-null entries of the array
    private int capacity = 1;
    // Internal array that is used
    protected Object[] array;

    /**
     * Zero Arg Constructor
     */
    public ArrayStructure() {
        size = 5;
        array = new Object[size];
    }

    /**
     * Returns the size of the array
     * @return the size of the list
     */
    public int size() { return size; }

    /**
     * Returns the number of non-null entries in the array
     * @return the number of non-null entries
     */
    public int getCapacity() { return capacity; }

    /**
     * Returns the number of non-null entries in the array
     * @return the number of non-null entries
     */
    public void setCapacity(int capacity) { this.capacity = capacity; }

    /**
     * Returns the value at the index in the array
     * @param index the index of the value in the array
     * @return the value at the index
     * @throws IndexOutOfBoundsException if index >= capacity of the array or index < 0
     */
    public T at(int index) throws IndexOutOfBoundsException {
        if(index >= capacity || index<0) throw new IndexOutOfBoundsException();

        return (T) array[index];
    }

    /**
     * Inserts an object into the array at specified index
     * @param index index of the array
     * @param data entry/value
     * @throws IndexOutOfBoundsException if index is not in range (index<0 || index>=capacity)
     * @return previous data at that index
     */
    public T add(int index, T data) throws IndexOutOfBoundsException {
        if(index >= capacity || index<0) throw new IndexOutOfBoundsException();
        T temp = (T) array[index];
        array[index] = data;
        return temp;
    }

    /**
     * Removes an object from the array at specified index
     * @param index index of the array
     * @return the value at the index of specified array
     * @throws IndexOutOfBoundsException if index is not in range (index < 0 || index >= size)
     */
    public T remove(int index) throws IndexOutOfBoundsException {
        if(index >= size || index<0) throw new IndexOutOfBoundsException();
        T temp = (T) array[index];
        array[index] = null;
        return temp;
    }

    /**
     * Inserts an object into the array
     * @param data entry/value
     * @throws IndexOutOfBoundsException if index is not in range (index<0 || index>=size)
     * @return previous data at that index
     */
    public abstract T add(T data) throws IndexOutOfBoundsException;

    /**
     * Removes an object from the array
     * @return the value at the index of specified array
     * @throws IndexOutOfBoundsException if index is not in range (index < 0 || index >= size)
     */
    public abstract T remove() throws IndexOutOfBoundsException;

    /**
     * Set the size of the array
     * @param size the size of the array
     */
    protected abstract void setSize(int size);
}
