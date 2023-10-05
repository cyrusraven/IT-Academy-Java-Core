public class Task3 {
    public static void main(String[] args) {
        String text = "надо купить один коробок спичек, не надо было покупать два.";
        String[] str = text.split(" ");

        String newText = String.join(" ", changedText(str));
        System.out.println(newText);

    }

    public static String[] changedText(String[] str) {
        String regEx = "^[аеёиоуыэюя].*";
        for (int i = 0; i < str.length; i++) {
            if (str[i].matches(regEx) && str[i].charAt(0) != str[i].charAt(str[i].length() - 1)) {
                str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
            } else if (!str[i].matches(regEx) && str[i].charAt(0) != str[i].charAt(str[i].length() - 1)) {
                    str[i] = str[i].substring(0, str[i].length() - 1)
                            + str[i].substring(str[i].length() - 1).toUpperCase();
            } else {
                str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1, str[i].length() - 1)
                        + str[i].substring(str[i].length() - 1).toUpperCase();
            }
        }
        return str;
    }
}
