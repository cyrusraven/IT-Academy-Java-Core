package by.it.academy.task1;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 3, 16, 3, 8, 2};

        ThreadMinMax thread1 = new ThreadMinMax(arr);
        ThreadMinMax thread2 = new ThreadMinMax(arr);

        try {
            thread1.getThread().join();
            thread2.getThread().join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("max = " + thread1.getMax());
        System.out.println("min = " + thread2.getMin());
    }
}
