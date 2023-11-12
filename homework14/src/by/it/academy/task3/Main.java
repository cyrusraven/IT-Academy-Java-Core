package by.it.academy.task3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            collection.add(random.nextInt(101));
        }

        collection.stream().min(Comparator.comparingInt(Integer::intValue)).ifPresent(min -> System.out.println(min
                + " is min number"));
        collection.stream().max(Comparator.comparingInt(Integer::intValue)).ifPresent(max -> System.out.println(max
                + " is max number"));
        collection.stream().mapToInt(Integer::intValue).average().ifPresent(avg -> System.out.println(avg
                + " is average"));
        collection.stream().reduce((a, b) -> a * b).ifPresent(multi -> System.out.println(multi
                + " is multiplication result"));
        collection.stream().reduce(Integer::sum).ifPresent(sum -> System.out.println(sum
                + " is sum result"));
        Arrays.stream(collection.stream().map(Object::toString).collect(Collectors.joining()).split("")).
                mapToInt(Integer::parseInt).reduce(Integer::sum).ifPresent(sum -> System.out.println(sum
                        + " is digits sum result"));

        System.out.println(collection);
    }
}
