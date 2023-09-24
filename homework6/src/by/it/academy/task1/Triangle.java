package by.it.academy.task1;

public class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public String getType() {
        if ((side1 == side2) && (side2 == side3)) {
            return "Равносторонний";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Равнобедренный";
        } else if (isRightTriangle()) {
            return "Прямоугольный";
        } else {
            return "Произвольный";
        }
    }

    private boolean isRightTriangle() {
        double[] sides = {side1, side2, side3};
        java.util.Arrays.sort(sides);
        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
    }
}
