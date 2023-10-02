public class Task7 {
    public static void main(String[] args) {
        String str = "petrod-1986@yahoo.com.au";
        System.out.println(isCorrectEmail(str));
    }

    public static boolean isCorrectEmail(String str) {
        String regEx = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        return str.matches(regEx);
    }
}
