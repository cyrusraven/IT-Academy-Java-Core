package by.it.academy.task2;

import java.util.Map;

import static by.it.academy.task2.CharCounter.getCharsCount;

public class Main {
    public static void main(String[] args) {
        String input = "baaccc";
        Map<Character, Integer> charCountMap = getCharsCount(input);

        for (Map.Entry<Character, Integer> character : charCountMap.entrySet()) {
            System.out.println(character);
        }
    }
}
