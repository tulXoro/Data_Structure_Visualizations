package main.java.data_structures.structure;

import main.java.data_structures.root.LinkedStructure;

/**
 * Represents a Linked List
 * @param <T> data type to be stored
 */
public class LinkedList<T> extends LinkedStructure<T> {

    public void add(T data) {
        if(head==null) head = new Node(data, head);
    }
}
