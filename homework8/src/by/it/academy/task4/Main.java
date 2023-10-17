package by.it.academy.task4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MagicBox magicBox = getMagicBox();

        System.out.println("Общая площадь: " + magicBox.calculateTotalArea());
        System.out.println("Общий периметр: " + magicBox.calculateTotalPerimeter());

        System.out.println("Фигуры удовлетворяющие заданным критериям:");
        List<Shape> filteredShapes = magicBox.getShapesByCriteria("Синий", "Пластик", Square.class);
        for (Shape shape : filteredShapes) {
            System.out.println(shape.getClass().getSimpleName() +
                    ", Цвет: " + shape.getColor() +
                    ", Материал: " + shape.getMaterial());
        }
    }

    private static MagicBox getMagicBox() {
        MagicBox magicBox = new MagicBox();

        Triangle triangle1 = new Triangle("Красный", "Бумага", 3, 4, 5);
        Triangle triangle2 = new Triangle("Розовый", "Пластик", 5,4,7);
        Square square1 = new Square("Синий", "Пластик", 4);
        Square square2 = new Square("Фиолетовый", "Бумага", 8);
        Rectangle rectangle1 = new Rectangle("Черный", "Ткань", 7,3);
        Rectangle rectangle2 = new Rectangle("Желтый", "Бумага", 8,4);
        Circle circle1 = new Circle("Коричневый", "Бумага", 8);
        Circle circle2 = new Circle("Зеленый", "Ткань", 10);
        magicBox.addShape(triangle1);
        magicBox.addShape(triangle2);
        magicBox.addShape(square1);
        magicBox.addShape(square2);
        magicBox.addShape(rectangle1);
        magicBox.addShape(rectangle2);
        magicBox.addShape(circle1);
        magicBox.addShape(circle2);
        
        magicBox.showShapes();
        return magicBox;
    }
}
