package by.it.academy.task1;

public class Main {
    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[]{
                new Triangle(2, 1, 2),
                new Triangle(2, 2, 2),
                new Triangle(3, 4, 5),
                new Triangle(4, 8, 9),
                new Triangle(6, 6, 6),
                new Triangle(7, 4, 7),
        };

        int countEquilateral = 0;
        int countIsosceles = 0;
        int countRightTriangle = 0;
        int countArbitrary = 0;

        for (Triangle value : triangles) {
            if (value.getType().equals("Равносторонний")) {
                countEquilateral++;
            } else if (value.getType().equals("Равнобедренный")) {
                countIsosceles++;
            } else if (value.getType().equals("Прямоугольный")) {
                countRightTriangle++;
            } else countArbitrary++;
        }

        Triangle[] equilateralTriangles = new Triangle[countEquilateral];
        Triangle[] isoscelesTriangles = new Triangle[countIsosceles];
        Triangle[] rightTriangles = new Triangle[countRightTriangle];
        Triangle[] arbitraryTriangles = new Triangle[countArbitrary];

        // Счетчики для каждого типа треугольника
        int countE = 0, countI = 0, countR = 0, countA = 0;

        for (Triangle triangle : triangles) {
            String type = triangle.getType();
            switch (type) {
                case "Равносторонний" -> equilateralTriangles[countE++] = triangle;
                case "Равнобедренный" -> isoscelesTriangles[countI++] = triangle;
                case "Прямоугольный" -> rightTriangles[countR++] = triangle;
                default -> arbitraryTriangles[countA++] = triangle;
            }
        }

        System.out.println("Количество равносторонних треугольников: " + countEquilateral +
                "\nКоличество равнобедренных треугольников: " + countIsosceles +
                "\nКоличество прямоугольных треугольников: " + countRightTriangle +
                "\nКоличество разносторонних треугольников: " + countArbitrary

        );

        System.out.println("Максимальный/минимальный периметр/площадь у равносторонних треугольников: "
                + getMaxPerimeter(equilateralTriangles) + "/" + getMinPerimeter(equilateralTriangles) + " и "
                + getMaxArea(equilateralTriangles) + "/" + getMinArea(equilateralTriangles) +
                "\nМаксимальный/минимальный периметр/площадь у равнобедренных треугольников: "
                + getMaxPerimeter(isoscelesTriangles) + "/" + getMinPerimeter(isoscelesTriangles) + " и "
                + getMaxArea(isoscelesTriangles) + "/" + getMinArea(isoscelesTriangles) +
                "\nМаксимальный/минимальный периметр/площадь у прямоугольных треугольников: "
                + getMaxPerimeter(rightTriangles) + "/" + getMinPerimeter(rightTriangles) + " и "
                + getMaxArea(rightTriangles) + "/" + getMinArea(rightTriangles) +
                "\nМаксимальный/минимальный периметр/площадь у произвольных треугольников: "
                + getMaxPerimeter(arbitraryTriangles) + "/" + getMinPerimeter(arbitraryTriangles) + " и "
                + getMaxArea(arbitraryTriangles) + getMinArea(arbitraryTriangles));
    }

    public static int getMaxPerimeter(Triangle[] triangle){
        int maxPerimeter = (int) triangle[0].calculatePerimeter();
        for (int i = 1; i < triangle.length; i++) {
            if(triangle[i].calculatePerimeter() > maxPerimeter){
                maxPerimeter = (int) triangle[i].calculatePerimeter();
            }
        }
        return maxPerimeter;
    }

    public static int getMinPerimeter(Triangle[] triangle){
        int minPerimeter = (int) triangle[0].calculatePerimeter();
        for (int i = 1; i < triangle.length; i++) {
            if(triangle[i].calculatePerimeter() < minPerimeter){
                minPerimeter = (int) triangle[i].calculatePerimeter();
            }
        }
        return minPerimeter;
    }

    public static double getMaxArea(Triangle[] triangle){
        double maxArea = triangle[0].calculateArea();
        for (int i = 1; i < triangle.length; i++) {
            if(triangle[i].calculateArea() > maxArea){
                maxArea = triangle[i].calculateArea();
            }
        }
        return maxArea;
    }

    public static double getMinArea(Triangle[] triangle){
        double minArea = triangle[0].calculateArea();
        for (int i = 1; i < triangle.length; i++) {
            if(triangle[i].calculateArea() < minArea){
                minArea = triangle[i].calculateArea();
            }
        }
        return minArea;
    }
}
