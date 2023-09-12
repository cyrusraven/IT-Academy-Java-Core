public class Task8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (sumOfDiv(i) == i) {
                System.out.println(i);
            }
        }
    }

    static int sumOfDiv(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}
