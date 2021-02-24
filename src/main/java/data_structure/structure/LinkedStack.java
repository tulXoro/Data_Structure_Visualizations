package main.java.data_structure.structure;

import main.java.data_structure.root.LinkedStructure;

/**
 * Represents a stack, here the Node at the "head" is the top of the stack.
 */
public class LinkedStack<T> extends LinkedStructure<T> {

    public LinkedStack() {
        super();
    }

    /**
     * Adds an object to the top of the stack
     * @param data to be added
     */
    public void add(T data) {
        head = new Node(data, head);
        size++;
    }

    /**
     * Removes the top element of the stack
     * @return the data that was previously the top of the stack
     */
    public T remove() {
        Node temp = head;
        head = head.next;
        return temp.data;
    }

}
