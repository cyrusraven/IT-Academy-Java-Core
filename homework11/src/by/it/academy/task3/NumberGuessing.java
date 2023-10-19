package by.it.academy.task3;

import java.util.Random;

public class NumberGuessing {
    private final int hiddenNumber;
    private int attempt;

    public NumberGuessing() {
        Random rand = new Random();
        hiddenNumber = rand.nextInt(1001);
        attempt = 0;
    }

    public int getAttempt() {
        return attempt;
    }

    public int getHiddenNumber() {
        return hiddenNumber;
    }

    public void numberGuessingAlgorithm(int number) throws LessException, GreaterException {
        attempt++;
        if (number < hiddenNumber) {
            throw new LessException("Less than the hidden number.");
        } else if (number > hiddenNumber) {
            throw new GreaterException("More than the hidden number.");
        }
    }
}
