public class Task3 {
    public static void main(String[] args) {
        int lastFibonacci = 10;
        int firstNum = 1;
        int secondNum = 1;
        System.out.print(firstNum + " " + secondNum + " ");
        for (int i = 3; i <= lastFibonacci; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(nextNum + " ");
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
