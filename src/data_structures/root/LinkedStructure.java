package data_structures.root;

/**
 * Represents the root of all data structures with a linked
 * implementation
 * @param <T> type of data that should be stored
 */
public abstract class LinkedStructure<T> {
    private int size;
    private Node<T> head;

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

    protected class Node<T> {
        private T data;
        private Node<T> next;

        private Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}
