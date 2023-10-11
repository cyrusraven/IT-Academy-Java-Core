package by.it.academy.task4;

public abstract class Shape {
    private final String color;
    private final String material;

    public Shape(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
