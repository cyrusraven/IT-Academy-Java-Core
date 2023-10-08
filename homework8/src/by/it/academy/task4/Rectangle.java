package by.it.academy.task4;

public class Rectangle extends Shape{
    private final double side1;
    private final double side2;
    public Rectangle(String color, String material, double side1, double side2) {
        super(color, material);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return Math.pow(side1, 2) + Math.pow(side2, 2);
    }
}
