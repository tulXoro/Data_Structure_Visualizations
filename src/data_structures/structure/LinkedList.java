package data_structures.structure;

import data_structures.root.LinkedStructure;

public class LinkedList<T> extends LinkedStructure<T> {

    public void add(T data) {
        if(head==null) head = new Node(data, head);
    }
}
