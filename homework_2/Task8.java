public class Task8 {
    public static void main(String[] args) {
        int x1 = 4;
        int y1 = 3;
        int x2 = 8;
        int y2 = 7;
        int k = (y1 - y2) / (x1 - x2);
        int b = y2 - k * x2;
        System.out.println("f(y) = " + k + "x " + "+ " + b);
    }
}
