public class Task7 {
    public static void main(String[] args) {
        long sum = 0;
        long count = 1;
        while (sum <= 100000) {
            sum += count;
            count++;
        }
        while (sum % 100000 != 0) {
            sum += count;
            count++;
        }
        System.out.println(sum);
        System.out.println(count - 1);
    }
}
