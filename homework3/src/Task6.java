public class Task6 {
    public static void main(String[] args) {
        int a = 6;
        int b = 13;
        int c = 7;
        int d = (int) (Math.pow(b, 2) - 4 * a * c);
        System.out.println(rootsOfTheEquation(a, b, d));
    }
    static String rootsOfTheEquation (int a, int b, int d) {
        if (d < 0) {
            return "Корней нет";
        } else if (d == 0) {
            int x = -b / (2 * a);
            return "Есть один корень: " + x;
        } else {
            int x1 = (int) ((-b + Math.sqrt(d)) / (2 * a));
            int x2 = (int) ((-b - Math.sqrt(d)) / (2 * a));
            return "Есть 2 различных корня: " + x1 + " и " + x2;
        }
    }
}
