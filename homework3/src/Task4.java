public class Task4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        int x = -3;
        System.out.println(isXInside(a, b, x));
    }
    static String isXInside(int a, int b, int x) {
        if (a < x && b > x) {
            return "расстояние от точки “x” до “а”: " + (x - a) + ", расстояние от точки “x” до “b”: " + (b - x);
        } else if (x == a) {
            return "точка “x” совпадает с одним из концов отрезка “а” = " + a + "," + " длина отрезка [a, b] = "
                    + (b - a);
        } else if (x == b) {
            return "точка “x” совпадает с одним из концов отрезка “b” = " + b + "," + " длина отрезка [a, b] = "
                    + (b - a);
        } else if (x < a) {
            return "“x” не принадлежит отрезку, расстояние до ближайшей точки “a”: " + (a - x);
        } else {
            return "“x” не принадлежит отрезку, расстояние до ближайшей точки “b”: " + (x - b);
        }
    }
}
