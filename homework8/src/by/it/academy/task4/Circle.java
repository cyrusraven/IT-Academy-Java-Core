package by.it.academy.task4;

public class Circle extends Shape{
    private final double radius;
    public Circle(String color, String material, double radius) {
        super(color, material);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
