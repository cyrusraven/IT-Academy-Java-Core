package by.it.academy.task4;

public class Task {
    private final String message;

    Task(String message) {
        this.message = message;
    }

    public void execute() {
        System.out.println("Running: " + message);
    }
}
