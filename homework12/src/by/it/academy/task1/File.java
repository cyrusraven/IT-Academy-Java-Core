package by.it.academy.task1;

import java.io.*;
import java.util.Random;

public class File {
    public void createFileWithNumbers(String name) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(name))) {
            for (int i = 0; i < 1000; i++) {
                out.write((new Random().nextInt(100000) + 1) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int[] readFile(int[] array, int startIndex, String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            int temp;
            int i = startIndex;
            StringBuilder numbers = new StringBuilder();
            while ((temp = bufferedReader.read()) != -1) {
                if (temp != 32) {
                    numbers.append((char) temp);
                } else {
                    array[i] = Integer.parseInt(numbers.toString());
                    i++;
                    numbers = new StringBuilder();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }
}
