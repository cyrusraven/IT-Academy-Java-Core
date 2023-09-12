public class Task9 {
    public static void main(String[] args) {
        double e = 0.000_0001;
        double step = 1;
        double exp = 1;
        int num = 1;
        while (step > e) {
            step *= 1.0 / num;
            exp += step;
            num++;
        }
        System.out.println(exp);
    }
}
