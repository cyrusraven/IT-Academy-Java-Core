public class Task5 {
    public static void main(String[] args) {
        int num = 567483;
        int sum = 0;
        int mult = 1;
        while (num > 0) {
            int n = num % 10;
            sum = sum + n;
            mult = mult * n;
            num = num / 10;
        }
        System.out.println("Сумма цифр: " + sum);
        System.out.println("Произведение цифр: " + mult);
    }
}
