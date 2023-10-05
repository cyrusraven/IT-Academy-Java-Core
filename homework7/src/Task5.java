public class Task5 {
    public static void main(String[] args) {
        String originalText = " Dog,  dogs, dog, DOG,   doG, cat ";
        String normalizedText = originalText.trim();
        String regEx = ",+\\s+";
        String str2 = normalizedText.replaceAll(regEx, " ");
        String[] words = str2.split(" ");

        System.out.println(count(words));
    }

    public static int count(String[] words) {
        int count = 1;
        for (String string : words) {
            String tmp = words[0];
            if (!tmp.equalsIgnoreCase(string)) {
                count++;
            }
        }
        return count;
    }
}
