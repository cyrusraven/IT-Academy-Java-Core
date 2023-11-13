package by.it.academy.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[2000];
        File fileUtils = new File();
        fileUtils.createFileWithNumbers("in1.txt");
        fileUtils.createFileWithNumbers("in2.txt");
        arr = fileUtils.readFile(arr, 0, "in1.txt");
        arr = fileUtils.readFile(arr, 1000, "in2.txt");
        Arrays.sort(arr);

        try (FileWriter fileWriter = new FileWriter("out.txt")) {
            for (int i : arr) {
                fileWriter.write(i + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
