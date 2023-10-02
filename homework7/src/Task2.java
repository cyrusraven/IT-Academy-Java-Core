public class Task2 {
    public static void main(String[] args) {
        String str = "раз два три";
        String[] str1 = str.split(" ");
        for (int i = str1.length-1; i >= 0; i--) {
            String str2 = str1[i];
            System.out.print(str2 + " ");
        }
    }
}
