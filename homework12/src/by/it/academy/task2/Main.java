package by.it.academy.task2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("text.txt");
            file.write("По полям, по полям синий трактор едет к нам.");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
            String line;
            int countOfWords = 0;
            int countOfSymbols = 0;

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split("[ ,.]");
                int countOfWordsInLine = 0;
                for(String word : words) {
                    if (!word.isEmpty()) {
                        countOfWordsInLine++;
                    }
                }
                countOfWords += countOfWordsInLine;

                int countSymbolsInLine = 0;
                Pattern pattern = Pattern.compile("[-.?!)(,:;]");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    countSymbolsInLine++;
                }
                countOfSymbols += countSymbolsInLine;
            }

            System.out.println("Количество слов = " + countOfWords);
            System.out.println("Количество символов: " + countOfSymbols);
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
