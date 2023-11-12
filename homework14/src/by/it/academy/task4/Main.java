package by.it.academy.task4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        myList = myList.stream().filter(s -> !s.contains("3"))
                .sorted(Comparator.comparing(s -> s.charAt(1)))
                .sorted(Collections.reverseOrder(Comparator.comparing(s -> s.charAt(0))))
                .skip(1)
                .limit(myList.size() - 2)
                .map(String::toUpperCase).toList();

        System.out.print(myList + "\nResult list size is " + myList.size());
    }
}
