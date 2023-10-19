package by.it.academy.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        NumberGuessing numberGuessing = new NumberGuessing();
        int attempt  = 100;

        while (true) {
            int hiddenNumber = new Random().nextInt(1001);

            try {
                numberGuessing.numberGuessingAlgorithm(hiddenNumber);
                break;
            } catch (LessException | GreaterException e) {
                System.out.println(e.getMessage());
            }

            if (numberGuessing.getAttempt() >= attempt) {
                System.out.println("Too many tries.");
                break;
            }
        }
        System.out.println("Hidden number: " + numberGuessing.getHiddenNumber() + "\n"
                + "Attempts: " + numberGuessing.getAttempt());
    }
}
