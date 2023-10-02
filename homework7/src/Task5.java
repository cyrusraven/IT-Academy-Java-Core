public class Task5 {
    public static void main(String[] args) {
        String str = " Dog,  dogs, dog, DOG,   doG, cat ";
        String str1 = str.trim();
        String regEx = ",+\\s+";
        String str2 = str1.replaceAll(regEx, " ");
        String[] str3 = str2.split(" ");

        System.out.println(count(str3));
    }

    public static int count(String[] str3) {
        int count = 0;
        for (String string : str3) {
            String tmp = str3[0];
            if (!tmp.equalsIgnoreCase(string)) {
                count++;
            }
        }
        return count;
    }
}
