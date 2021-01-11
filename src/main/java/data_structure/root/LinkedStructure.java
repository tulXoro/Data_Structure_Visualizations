package main.java.data_structure.root;

/**
 * Represents the root of all data structures with a linked
 * implementation
 * @param <T> type of data that should be stored
 */
public abstract class LinkedStructure<T> {
    protected int size;
    protected Node head;

    /**
     * Zero Arg Constructor
     */
    public LinkedStructure() {}

    /**
     * Returns the size of the linked structure
     * @return size of linked structure
     */
    public int size() { return this.size; }

    /**
     * Adds a new node
     * @param data to be added
     */
    public abstract void add(T data);

    /**
     * Removes a value from the linked structure
     * @return value that was removed
     */
    public abstract T remove();

    /**
     * Inner Class Node representing an object in linked structure
     */
    protected class Node {
        public T data;
        public Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
