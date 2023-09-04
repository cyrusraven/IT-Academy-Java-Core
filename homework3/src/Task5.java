public class Task5 {
    public static void main(String[] args) {
        int x = -7;
        int y = 4;
        System.out.println(getCoordinateQuarterName(x, y));
    }

    static String getCoordinateQuarterName(int x, int y) {
        if (x > 0 && y < 0) {
            return "Четвертая четверть";
        } else if (x < 0 && y > 0) {
            return "Вторая четверть";
        } else if (x < 0 && y < 0) {
            return "Третья четверть";
        } else {
            return "Первая четверть";
        }
    }
}
