package by.it.academy.task4;

public class Main {
    public static void main(String[] args) {
        Executor executor = new Executor();
        executor.start();

        executor.addTask(new Task("Task 1"));
        executor.addTask(new Task("Task 2"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.addTask(new Task("Task 3"));
        executor.addTask(new Task("Task 4"));

        executor.terminate();
    }
}
