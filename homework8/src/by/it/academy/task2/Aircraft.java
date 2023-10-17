package by.it.academy.task2;

public abstract class Aircraft {
    private final int loadCapacity;
    private final int capacity;
    private final double range;

    private final String name;
    public Aircraft(int loadCapacity, int capacity, double range, String name) {
        this.loadCapacity = loadCapacity;
        this.capacity = capacity;
        this.range = range;
        this.name = name;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getRange() {
        return range;
    }

    public String getName() {
        return name;
    }
}
