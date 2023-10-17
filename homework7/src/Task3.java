public class Task3 {
    public static void main(String[] args) {
        String text = "надо купить один коробок спичек, не надо было покупать два.";
        String[] words = text.split(" ");

        String newText = String.join(" ", changedText(words));
        System.out.println(newText);

    }

    public static String[] changedText(String[] words) {
        String[] newWords = new String[words.length];
        String regEx = "^[аеёиоуыэюя].*";
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches(regEx) && words[i].charAt(0) != words[i].charAt(words[i].length() - 1)) {
                newWords[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            } else if (!words[i].matches(regEx) && words[i].charAt(0) != words[i].charAt(words[i].length() - 1)) {
                    newWords[i] = words[i].substring(0, words[i].length() - 1)
                            + words[i].substring(words[i].length() - 1).toUpperCase();
            } else {
                newWords[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1, words[i].length() - 1)
                        + words[i].substring(words[i].length() - 1).toUpperCase();
            }
        }
        return newWords;
    }
}
