package by.it.academy.task1;

import java.util.Arrays;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        long[] array = new long[Integer.MAX_VALUE];
        Arrays.fill(array, 10);
        System.out.println(Arrays.toString(array));
    }
}
