public class Task7 {
    public static void main(String[] args) {
        String text = "У Джека почтовый адрес petrod-1986@yahoo.com.au, а у Ивана i.ivanov@it-academy.by";
        String regEx = ",";
        String str2 = text.replaceAll(regEx, " ");
        String[] words = str2.split(" ");

        String emails = String.join("\n", isCorrectEmail(words));
        System.out.println(emails);
    }

    public static String[] isCorrectEmail(String[] words) {
        String [] email = new String[numOfEmail(words)];
        int index = 0;
        String regEx = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        for (String word : words) {
            if (word.matches(regEx)) {
                email[index] = word;
                index++;
            }
        }
        return email;
    }

    public static int numOfEmail(String[] words) {
        int count = 0;
        String regEx = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        for (String word : words) {
            if (word.matches(regEx)) {
                count++;
            }
        }
        return count;
    }
}
