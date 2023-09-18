public class Task3 {
    public static void main(String[] args) {
        int dayOfMonth = 8;
        int numOfMonth = 10;
        int res = 0;
        int[] month = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < month.length; i++) {
            if (numOfMonth != month[i]) {
                res += daysOfMonth(i);
                continue;
            }
            int res1 = res + dayOfMonth;
            System.out.println(res1);
        }
    }

    static int daysOfMonth(int day) {
        return switch (day) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };
    }
}
