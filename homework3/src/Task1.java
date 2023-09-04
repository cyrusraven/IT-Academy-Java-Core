public class Task1 {
    public static void main(String[] args) {
        int x = 47;
        int y = 33;
        int z = 10;
        System.out.println(getAverage(x, y, z));
    }

    static double getAverage(int x, int y, int z) {
        return x > z ? (double) (x + y) / 2 : z;
    }
}
