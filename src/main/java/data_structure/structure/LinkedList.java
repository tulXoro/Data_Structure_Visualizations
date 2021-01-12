package main.java.data_structure.structure;

import main.java.data_structure.root.LinkedStructure;

/**
 * Represents an ordinary Linked List
 * @param <T> data type to be stored
 */
public class LinkedList<T> extends LinkedStructure<T> {

    /**
     * Adds a new node to the list (elements are added to the end
     * @param data to be added
     */
    public void add(T data) {
        size++;
        if(head==null) {
            head = new Node(data, null);
            return;
        }

        Node current = head;
        while(current.next!=null) current = current.next;
        current.next = new Node(data, null);
    }

    /**
     * Add an element at a specific index
     * @param index to add a value
     * @param data value to be added
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
     */
    public void add(int index, T data) throws IndexOutOfBoundsException{
        if(index<0 || index>size) throw new IndexOutOfBoundsException();
        size++;
        int temp = 0;

        // if add to the start, increase the size then move on
        if(index==0) {
            head = new Node(data, head);
            return;
        }
        Node current = head;
        while(temp++<index-1) {
            current=current.next;
        }
        current.next = new Node(data, current.next);
    }

    /**
     * Grabs the object corresponding to its index
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
        if(index==0) return remove();

        Node current = head;

        if(index==size-1) {
            while(current.next!=null) current = current.next;
            Node temp = current;
            size--;
            return temp.data;
        }

        // set current to node at index-1
        // next node is node to be removed
        int count = 0;
        while(count++<index-1) current=current.next;
        // gets a temporary node as the index to be removed
        Node temp = current.next;
        current.next = current.next.next; // current.next points to node that is after node to be deleted
        size--;
        return temp.data;
    }

}
