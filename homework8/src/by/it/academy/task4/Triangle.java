package by.it.academy.task4;

public class Triangle extends Shape{
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(String color, String material, double side1, double side2, double side3) {
        super(color, material);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(calculatePerimeter() * (calculatePerimeter() - side1) * (calculatePerimeter() - side2)
                * (calculatePerimeter() - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
