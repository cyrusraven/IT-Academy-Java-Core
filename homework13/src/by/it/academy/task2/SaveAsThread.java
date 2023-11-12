package by.it.academy.task2;

import java.io.*;

public class SaveAsThread implements Runnable{
    private final int[] arr;
    private final String fileName;
    private final String threadName;
    private final Thread thread;

    public SaveAsThread(int[] arr, String fileName, String threadName) {
        this.arr = arr;
        this.fileName = fileName;
        this.threadName = threadName;
        thread = new Thread(this, "SaveThread");
    }

    public void start() {
        thread.start();
    }

    public void run() {
        System.out.println("Begin thread: " + threadName);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);

            PrintStream printStream = new PrintStream(fileOutputStream);

            printStream.println(arr.length);
            for (int i : arr) {
                printStream.println(i);
            }
            printStream.close();
            fileOutputStream.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("End thread: " + threadName);
    }
}
