public class Task6 {
    public static void main(String[] args) {
        for (int i = 20; i <= 30; i++) {
            int n = i;
            System.out.print(n + " ");
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                    System.out.print(n + " ");
                } else {
                    n = (n * 3 + 1) / 2;
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }
}
