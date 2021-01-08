package main.java.data_structures.structure;

import main.java.data_structures.root.LinkedStructure;

/**
 * Represents an ordinary Linked List
 * @param <T> data type to be stored
 */
public class LinkedList<T> extends LinkedStructure<T> {

    /**
     * Adds a new node to the list
     * @param data to be added
     */
    public void add(T data) {
        if(size==0) {
            head = new Node(data, head);
            size++;
            return;
        }

        Node current = head;
        while(current.next!=null) current = current.next;
        current.next = new Node(data, null);
        size++;
    }

    /**
     * Grabs the object corresponding to it's index
     * @param index the index of a value in the linked list
     * @return the value at the linked list
     * @throws IndexOutOfBoundsException if index does not exist in the list
     */
    public T at(int index) throws IndexOutOfBoundsException {
        if(index>=size) throw new IndexOutOfBoundsException();
        Node current = head;
        int count = 0;
        while(true) {
            if(count==index) return current.data;
            current = current.next;
            count++;
        }
    }

    /**
     * Removes the head of the linked list
     * @return the previous head's value
     * @throws NullPointerException if head is null
     */
    public T remove() throws NullPointerException{
        if(head==null) throw new NullPointerException();
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    /**
     * Removes the value specified at an index
     * @param index the value at that index should be removed
     * @return the previous value that was at that index
     * @throws IndexOutOfBoundsException if index is not in list
     */
    public T remove(int index) throws IndexOutOfBoundsException{
        if(index>=size) throw new IndexOutOfBoundsException();

        Node current = head;
        if(index==0) {
            head = null;
            return current.data;
        }

        int count = 1;
        while(true) {
            if(count==index) {
                Node temp = current.next;
                current.next = current.next.next;
                size--;
                return temp.data;
            }
            count++;
        }
    }

}
