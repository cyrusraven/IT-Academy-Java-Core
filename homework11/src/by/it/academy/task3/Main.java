package by.it.academy.task3;

public class Main {
    public static void main(String[] args) {
        NumberGuessing numberGuessing = new NumberGuessing();
        int min = 0;
        int max = 1000;
        int attempt  = 0;

        while (true) {
            int hiddenNumber = min + (max - min) / 2;
            try {
                numberGuessing.numberGuessingAlgorithm(hiddenNumber);
                System.out.println("It's right: " + hiddenNumber);
                System.out.println("Attempts: " + attempt);
                break;
            } catch (LessException e) {
                System.out.println("Attempt " + attempt + ": " + e.getMessage());
                min = hiddenNumber + 1;
            } catch (GreaterException e) {
                System.out.println("Attempt " + attempt + ": " + e.getMessage());
                max = hiddenNumber - 1;
            }
            attempt++;
        }
    }
}
