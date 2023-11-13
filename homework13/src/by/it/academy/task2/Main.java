package by.it.academy.task2;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 44, -3, 2, 10};
        int[] arr2 = {3, 6, 1, 55, 19, 1};
        int[] arr3 = {1, -1, -2, 4, 6, 9};

        SaveAsThread t1 = new SaveAsThread(arr1, "arr1.txt", "thread1");
        SaveAsThread t2 = new SaveAsThread(arr2, "arr2.txt", "thread2");
        SaveAsThread t3 = new SaveAsThread(arr3, "arr3.txt", "thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}
