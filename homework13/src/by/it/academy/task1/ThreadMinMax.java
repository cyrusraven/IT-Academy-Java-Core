package by.it.academy.task1;

public class ThreadMinMax implements Runnable {
    private final Thread thread;
    private final int[] arr;
    private int max;
    private int min;

    public ThreadMinMax(int[] arr) {
        this.arr = arr;
        this.thread = new Thread(this, "thread");
        thread.start();
    }

    @Override
    public void run() {
        int max1 = arr[0];
        int min1 = arr[0];

        for (int i : arr) {
            if (max1 < i) {
                max1 = i;
            }
            if (min1 > i) {
                min1 = i;
            }
        }

        max = max1;
        min = min1;
    }

    public Thread getThread() {
        return thread;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
