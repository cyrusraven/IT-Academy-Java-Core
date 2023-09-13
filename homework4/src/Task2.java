public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 32; i <= 126; i++) {
            if (count >= 5) {
                System.out.println();
                count = 0;
            }
            count++;
            System.out.printf("%d:%c\t", i,  (char) i);
        }
    }
}


