public class Task3 {
    public static void main(String[] args) {
        int dayOfMonth = 8;
        int month = 10;
        int res = 0;
        int[] daysOfYear = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month - 1; i++) {
            res += daysOfYear[i];
        }
        int res1 = res + dayOfMonth;
        System.out.println(res1);
    }
}
