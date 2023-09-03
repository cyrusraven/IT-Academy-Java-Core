public class Task5 {
    public static void main(String[] args) {
        int x = -7;
        int y = 4;
        System.out.println(belongsOrNot(x, y));
    }
    static String belongsOrNot(int x, int y) {
        if (x > 0 && y > 0) {
            return "Первая четверть";
        } else if (x < 0 && y > 0) {
            return "Вторая четверть";
        } else if (x < 0 && y < 0) {
            return "Третья четверть";
        } else {
            return "Четвертая четверть";
        }
    }
}
