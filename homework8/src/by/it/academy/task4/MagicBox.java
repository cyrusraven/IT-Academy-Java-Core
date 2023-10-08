package by.it.academy.task4;

import java.util.ArrayList;
import java.util.List;

public class MagicBox {
    private final List<Shape> shapes;

    public MagicBox() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        if (shapes.size() < 100) {
            shapes.add(shape);
        } else {
            System.out.println("Магическая коробка переполнена!");
        }
    }

    public void showShapes() {
        for (Shape shape : shapes) {
            System.out.println("Фигура: " + shape.getClass().getSimpleName() +
                    ", Цвет: " + shape.getColor() +
                    ", Материал: " + shape.getMaterial());
        }
    }

    public double calculateTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    public double calculateTotalPerimeter() {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    public List<Shape> getShapesByCriteria(String color, String material, Class<?> shapeType) {
        List<Shape> filteredShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape.getClass().equals(shapeType) && shape.getColor().equals(color)
                    && shape.getMaterial().equals(material)) {
               filteredShapes.add(shape);
            }
        }
        return filteredShapes;
    }
}
