public class Task3 {
    public static void main(String[] args) {
        int a = 24;
        int b = 40;
        int c = 50;
        System.out.println(getTriangle(a, b, c));
    }
    static boolean getTriangle(int a, int b, int c) {
        return isMore1(a, b, c) && isMore2(a, b, c) && isMore3(a, b, c);
    }
    static boolean isMore1(int a, int b, int c) {
        return a + b > c;
    }
    static boolean isMore2(int a, int b, int c) {
        return a + c > b;
    }
    static boolean isMore3(int a, int b, int c) {
        return b + c > a;
    }
}
