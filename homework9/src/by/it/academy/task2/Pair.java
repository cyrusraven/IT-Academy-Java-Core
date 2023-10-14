package by.it.academy.task2;

public class Pair<T, V> {
    private T first;
    private V last;

    public Pair(T first, V last) {
        this.first = first;
        this.last = last;
    }

    public T first() {
        return first;
    }

    public V last() {
        return last;
    }

    public Pair<V, T> swap() {
        return new Pair<>(last, first);
    }

    public T replaceFirst(T value) {
        first = value;
        return first;
    }
    public V replaceLast(V value) {
        last = value;
        return last;
    }

    @Override
    public String toString() {
        return "Пара: " + first +
                ", " + last;
    }
}
