package by.it.academy.task2;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 1, 4, 18, 5, 2};

        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new MergeSort(array));

        System.out.println(Arrays.toString(array));
    }
}
