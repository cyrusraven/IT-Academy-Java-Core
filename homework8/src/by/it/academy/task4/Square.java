package by.it.academy.task4;

public class Square extends Shape{
    private final double side;

    public Square(String color, String material, double side) {
        super(color, material);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
