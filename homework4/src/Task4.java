public class Task4 {
    public static void main(String[] args) {
        int num = 2335768;
        int even = 0;
        int odd = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            num /= 10;
        }
        System.out.println("Количество четных цифр: " + even);
        System.out.println("Количество нечетных цифр: " + odd);
    }
}
