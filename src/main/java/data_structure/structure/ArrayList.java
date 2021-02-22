package main.java.data_structure.structure;

import main.java.data_structure.root.ArrayStructure;

public class ArrayList<T> extends ArrayStructure<T> {
    public ArrayList(int size) {
        setSize(size);
        array = new Object[size];
    }

    @Override
    public T add(Object data) throws IndexOutOfBoundsException {
        if(size()==getCapacity()) throw new IndexOutOfBoundsException();
        T temp = (T) array[getCapacity()-1];
        array[getCapacity()-1]= data;
        if(getCapacity()<size()) setCapacity(getCapacity()+1);
        return temp;
    }

    @Override
    public T remove() throws IndexOutOfBoundsException {
        if(getCapacity()==0) throw new IndexOutOfBoundsException();
        T temp = (T) array[getCapacity()-1];
        array[getCapacity()] = null;
        return temp;
    }

    //TODO: Make new array and transfer data from that array to another.
    @Override
    protected void setSize(int size) {

    }
}
