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
        int countRightAngle = 0;
        int countScalene = 0;

        Triangle maxAreaRavnoStoronnih = null;
        double maxAreaRavnoStoronnihValue = Double.MIN_VALUE;
        Triangle minAreaRavnoStoronnih = null;
        double minAreaRavnoStoronnihValue = Double.MAX_VALUE;

        Triangle maxAreaRavnoBedrennih = null;
        double maxAreaRavnoBedrennihValue = Double.MIN_VALUE;
        Triangle minAreaRavnoBedrennih = null;
        double minAreaRavnoBedrennihValue = Double.MAX_VALUE;

        Triangle maxAreaPrjamougolnih = null;
        double maxAreaPrjamougolnihValue = Double.MIN_VALUE;
        Triangle minAreaPrjamougolnih = null;
        double minAreaPrjamougolnihValue = Double.MAX_VALUE;

        Triangle maxAreaProizvolnih = null;
        double maxAreaProizvolnihValue = Double.MIN_VALUE;
        Triangle minAreaProizvolnih = null;
        double minAreaProizvolnihValue = Double.MAX_VALUE;

        Triangle maxPerimeterRavnoStoronnih = null;
        double maxPerimeterRavnoStoronnihValue = Double.MIN_VALUE;
        Triangle minPerimeterRavnoStoronnih = null;
        double minPerimeterRavnoStoronnihValue = Double.MAX_VALUE;

        Triangle maxPerimeterRavnoBedrennih = null;
        double maxPerimeterRavnoBedrennihValue = Double.MIN_VALUE;
        Triangle minPerimeterRavnoBedrennih = null;
        double minPerimeterRavnoBedrennihValue = Double.MAX_VALUE;

        Triangle maxPerimeterPrjamougolnih = null;
        double maxPerimeterPrjamougolnihValue = Double.MIN_VALUE;
        Triangle minPerimeterPrjamougolnih = null;
        double minPerimeterPrjamougolnihValue = Double.MAX_VALUE;

        Triangle maxPerimeterProizvolnih = null;
        double maxPerimeterProizvolnihValue = Double.MIN_VALUE;
        Triangle minPerimeterProizvolnih = null;
        double minPerimeterProizvolnihValue = Double.MAX_VALUE;

        for (Triangle triangle : triangles) {
            String type = triangle.getType();
            double area = triangle.calculateArea();
            double perimeter = triangle.calculatePerimeter();

            switch (type) {
                case "Равносторонний":
                    countEquilateral++;
                    if (area > maxAreaRavnoStoronnihValue) {
                        maxAreaRavnoStoronnihValue = area;
                        maxAreaRavnoStoronnih = triangle;
                    }
                    if (area < minAreaRavnoStoronnihValue) {
                        minAreaRavnoStoronnihValue = area;
                        minAreaRavnoStoronnih = triangle;
                    }
                    if (area > maxPerimeterRavnoStoronnihValue) {
                        maxPerimeterRavnoStoronnihValue = perimeter;
                        maxPerimeterRavnoStoronnih = triangle;
                    }
                    if (area < minPerimeterRavnoStoronnihValue) {
                        minAreaRavnoStoronnihValue = perimeter;
                        minPerimeterRavnoStoronnih = triangle;
                    }
                    break;
                case "Равнобедренный":
                    countIsosceles++;
                    if (area > maxAreaRavnoBedrennihValue) {
                        maxAreaRavnoBedrennihValue = area;
                        maxAreaRavnoBedrennih = triangle;
                    }
                    if (area < minAreaRavnoBedrennihValue) {
                        minAreaRavnoBedrennihValue = area;
                        minAreaRavnoBedrennih = triangle;
                    }
                    if (area > maxPerimeterRavnoBedrennihValue) {
                        maxPerimeterRavnoBedrennihValue = perimeter;
                        maxPerimeterRavnoBedrennih = triangle;
                    }
                    if (area < minPerimeterRavnoBedrennihValue) {
                        minPerimeterRavnoBedrennihValue = perimeter;
                        minPerimeterRavnoBedrennih = triangle;
                    }
                    break;
                case "Прямоугольный":
                    countRightAngle++;
                    if (area > maxAreaPrjamougolnihValue) {
                        maxAreaPrjamougolnihValue = area;
                        maxAreaPrjamougolnih = triangle;
                    }
                    if (area < minAreaPrjamougolnihValue) {
                        minAreaPrjamougolnihValue = area;
                        minAreaPrjamougolnih = triangle;
                    }
                    if (area > maxPerimeterPrjamougolnihValue) {
                        maxPerimeterPrjamougolnihValue = perimeter;
                        maxPerimeterPrjamougolnih = triangle;
                    }
                    if (area < minPerimeterPrjamougolnihValue) {
                        minPerimeterPrjamougolnihValue = perimeter;
                        minPerimeterPrjamougolnih = triangle;
                    }
                    break;
                case "Произвольный":
                    countScalene++;
                    if (area > maxAreaProizvolnihValue) {
                        maxAreaProizvolnihValue = area;
                        maxAreaProizvolnih = triangle;
                    }
                    if (area < minAreaProizvolnihValue) {
                        minAreaProizvolnihValue = area;
                        minAreaProizvolnih = triangle;
                    }
                    if (area > maxPerimeterProizvolnihValue) {
                        maxPerimeterProizvolnihValue = perimeter;
                        maxPerimeterProizvolnih = triangle;
                    }
                    if (area < minPerimeterProizvolnihValue) {
                        minPerimeterProizvolnihValue = perimeter;
                        minPerimeterProizvolnih = triangle;
                    }
                    break;
            }
        }

        System.out.println("Количество равносторонних треугольников: " + countEquilateral);
        System.out.println("Количество равнобедренных треугольников: " + countIsosceles);
        System.out.println("Количество прямоугольных треугольников: " + countRightAngle);
        System.out.println("Количество произвольных треугольников: " + countScalene);

        if (maxAreaRavnoStoronnih != null && maxPerimeterRavnoStoronnih != null) {
            System.out.println("Треугольник с максимальной площадью/периметром среди равносторонних: "
                    + maxAreaRavnoStoronnihValue + "/" + maxPerimeterRavnoStoronnihValue);
        }
        if (minAreaRavnoStoronnih != null && minPerimeterRavnoStoronnih != null) {
            System.out.println("Треугольник с минимальной площадью/периметром среди равносторонних: "
                    + minAreaRavnoStoronnihValue + "/" + minPerimeterRavnoStoronnihValue);
        }

        if (maxAreaRavnoBedrennih != null && maxPerimeterRavnoBedrennih != null) {
            System.out.println("Треугольник с максимальной площадью/периметром среди равнобедренных: "
                    + maxAreaRavnoBedrennihValue + "/" + maxPerimeterRavnoBedrennihValue);
        }
        if (minAreaRavnoBedrennih != null && minPerimeterRavnoBedrennih != null) {
            System.out.println("Треугольник с минимальной площадью/периметром среди равнобедренных: "
                    + minAreaRavnoBedrennihValue + "/" + minPerimeterRavnoBedrennihValue);
        }

        if (maxAreaPrjamougolnih != null && maxPerimeterPrjamougolnih != null) {
            System.out.println("Треугольник с максимальной площадью/периметром среди прямоугольных: "
                    + maxAreaPrjamougolnihValue + "/" + maxPerimeterPrjamougolnihValue);
        }
        if (minAreaPrjamougolnih != null && minPerimeterPrjamougolnih != null) {
            System.out.println("Треугольник с минимальной площадью/периметром среди прямоугольных: "
                    + minAreaPrjamougolnihValue + "/" + minPerimeterPrjamougolnihValue);
        }

        if (maxAreaProizvolnih != null && maxPerimeterProizvolnih != null) {
            System.out.println("Треугольник с максимальной площадью/периметром среди произвольных: "
                    + maxAreaProizvolnihValue + "/" + maxPerimeterProizvolnihValue);
        }
        if (minAreaProizvolnih != null && minPerimeterProizvolnih != null) {
            System.out.println("Треугольник с минимальной площадью/периметром среди произвольных: "
                    +  minAreaProizvolnihValue + "/" + minPerimeterProizvolnihValue);
        }
    }
}
