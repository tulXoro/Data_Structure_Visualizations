package main.java.data_structure.structure;

import main.java.data_structure.root.ArrayStructure;

public class Array<T> extends ArrayStructure<T> {
    public Array(int size) {
        size = this.size;
        array = new Object[size];
    }

    @Override
    public T add(T data) throws IndexOutOfBoundsException, IllegalAccessException {
        throw new IllegalAccessException("This method is not implemented in class Array");
    }

    @Override
    public T remove() throws IndexOutOfBoundsException, IllegalAccessException {
        throw new IllegalAccessException("This method is not implemented in class Array");
    }

    @Override
    protected void setSize(int size) throws IllegalAccessException {
        throw new IllegalAccessException("This method is not implemented in class Array");
    }
}
