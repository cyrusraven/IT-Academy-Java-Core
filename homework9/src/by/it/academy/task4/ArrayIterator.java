package by.it.academy.task4;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private final T[][] array;
    private int i;
    private int j;

    public ArrayIterator(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return i < array.length && j < array[i].length;
    }

    @Override
    public T next() {
        T t = array[i][j++];
        if (j >= array[i].length) {
            i++;
            j = 0;
        }
        return t;
    }
}
