public class Task1 {
    public static void main(String[] args) {
        String str = "Заказ";
        char[] charArray = str.toLowerCase().toCharArray();
        for(int i=0; i < charArray.length/2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }

        String str1 = new String(charArray);

        if (str.toLowerCase().equals(str1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
