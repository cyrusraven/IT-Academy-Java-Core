public class Task2 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(numOfMonth(num));
    }
    static String numOfMonth(int num) {
        return switch (num) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Не то число";
        };
    }
}
