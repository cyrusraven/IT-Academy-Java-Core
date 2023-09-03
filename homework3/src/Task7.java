public class Task7 {
    public static void main(String[] args) {
        int a = 56;
        int b = 78;
        int c = 100;
        int d = -47;
        int e = -10;
        int max = 0;
        int min = 0;
        String maxNum = "a";
        String minNum = "a";
        System.out.println(maxMinOrEqually(a, b, c, d, e, max, min, maxNum, minNum));
    }

    static String maxMinOrEqually(int a, int b, int c, int d, int e, int max, int min, String maxNum, String minNum) {
        if (a == b && a == c && a == d && a == e) {
            return "Числа между собой равны " + a;
        }
        if (a > b && a > c && a > d && a > e) {
            max = a;
            maxNum = "a";
        } else if (a < b && a < c && a < d && a < e) {
            min = a;
            minNum = "a";
        }
        if (b > a && b > c && b > d && b > e) {
            max = b;
            maxNum = "b";
        } else if (b < a && b < c && b < d && b < e) {
            min = b;
            minNum = "b";
        }
        if (c > a && c > b && c > d && c > e) {
            max = c;
            maxNum = "c";
        } else if (c < a && c < b && c < d && c < e) {
            min = c;
            minNum = "c";
        }
        if (d > a && d > b && d > c && d > e) {
            max = d;
            maxNum = "d";
        } else if (d < a && d < b && d < c && d < e) {
            min = d;
            minNum = "d";
        }
        if (e > a && e > b && e > c && e > d) {
            max = e;
            maxNum = "e";
        } else if (e < a && e < b && e < c && e < d) {
            min = e;
            minNum = "e";
        }
        return "Максимальное число " + maxNum + " со значением " + max + "\nМинимальное число " + minNum
                + " со значением " + min;
    }
}
