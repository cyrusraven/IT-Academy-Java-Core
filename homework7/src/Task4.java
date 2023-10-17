public class Task4 {
    public static void main(String[] args) {
        String str = " I   love       Java ";
        String str1 = str.trim();
        String regEx = "\\s+";
        System.out.println(str1.replaceAll(regEx, " "));
    }
}
