public class Task3 {
    public static void main(String[] args) {
        String str = "коробок";
        System.out.println(changedWord(str));
    }

    public static String changedWord(String str){
        String regEx = "^[аеёиоуыэюя].*";
        boolean b = str.charAt(0) != str.charAt(str.length() - 1);
        if (str.matches(regEx) && b) {
            str = str.substring(0, 1).toUpperCase() + str.substring(1);
        } else {
            String upperCase = str.substring(str.length() - 1).toUpperCase();
            if (!str.matches(regEx) && b) {
                str = str.substring(0, str.length() - 1) + upperCase;
            } else {
                str = str.substring(0, 1).toUpperCase() + str.substring(1, str.length() - 1) + upperCase;
            }
        }
        return str;
    }
}
