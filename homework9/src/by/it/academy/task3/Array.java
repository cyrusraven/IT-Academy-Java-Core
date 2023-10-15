package by.it.academy.task3;

import java.util.Arrays;
import java.util.Iterator;

public class Array<T> implements Iterable<T> {
    private final T [] arr;
    private int i;

    public Array(T[] arr) {
       this.arr = arr;
    }

    public T getElement(int i) {
        return arr[i];
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public void changeElement(int i, T value) {
        arr[i] = value;
    }

    private class ArrayIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < i;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T element = arr[index];
                System.out.println(element);
                index++;
                return element;
            }
            return null;
        }
    }
}
