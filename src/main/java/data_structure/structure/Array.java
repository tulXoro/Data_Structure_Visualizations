package main.java.data_structure.structure;

import main.java.data_structure.root.ArrayStructure;

public class Array<T> extends ArrayStructure<T> {
    public Array(int size) {
        setSize(size);
        array = new Object[size];
    }

    @Override
    public T add(T data) throws IndexOutOfBoundsException {
        T temp = (T) array[getCapacity()-1];
        array[getCapacity()-1]= data;
        if(getCapacity()<size()) setCapacity(getCapacity()+1);
        return temp;
    }

    @Override
    public T remove() throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    protected void setSize(int size) {

    }
}
