package by.it.academy.task3;

import java.util.Iterator;

public class Array<T> implements Iterator<T> {
    private final T [] arr;
    private int i;

    public Array(T[] arr) {
        this.arr = arr;
    }

    public T getElement(int i) {
        return arr[i];
    }

    public void putElement(int i, T value) {
        arr[i] = value;
    }

    @Override
    public boolean hasNext() {
        return i < arr.length;
    }

    @Override
    public T next() {
        return arr[i++];
    }
}
