public class Task6 {
    public static void main(String[] args) {
        double a = 6;
        double b = 13;
        double c = 7;
        double d = (Math.pow(b, 2) - 4 * a * c);
        System.out.println(rootsOfTheEquation(a, b, d, c));
    }

    static String rootsOfTheEquation (double a, double b, double d, double c) {
        if (a == 0 && b == 0 && c == 0) {
            return "Infinity";
        } else if (d < 0) {
            return "Корней нет";
        } else if (d == 0) {
            double x = -b / (2 * a);
            return "Есть один корень: " + x;
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            return "Есть 2 различных корня: " + x1 + " и " + x2;
        }
    }
}
