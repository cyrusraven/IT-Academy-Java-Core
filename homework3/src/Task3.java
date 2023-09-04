public class Task3 {
    public static void main(String[] args) {
        int a = 24;
        int b = 40;
        int c = 50;
        System.out.println(isTriangle(a, b, c));
    }

    static boolean isTriangle(int a, int b, int c) {
        return isSumGreater(a, b, c) && isSumGreater(a, c, b) && isSumGreater(b, c, a);
    }

    static boolean isSumGreater(int a, int b, int c) {
        return a + b > c;
    }
}
