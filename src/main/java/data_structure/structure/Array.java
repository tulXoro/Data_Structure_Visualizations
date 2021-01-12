package main.java.data_structure.structure;

import main.java.data_structure.root.ArrayStructure;

public class Array<T> extends ArrayStructure<T> {
    public Array(int size) {
        setSize(size);
        array = new Object[size];
    }

    @Override
    protected void setSize(int size) {

    }
}
