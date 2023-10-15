package by.it.academy.task1;

import java.io.Serializable;

public class SomeClass<T extends String, V extends Animal & Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public SomeClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
}
