package by.it.academy.task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Mark", "B", 1, Arrays.asList(4, 4, 3)),
                new Student("Kamilla", "A", 2, Arrays.asList(4, 3, 3)),
                new Student("Elizabeth", "A", 3, Arrays.asList(5, 5, 5)),
                new Student("Diana", "B", 4, Arrays.asList(4, 5, 5)),
                new Student("Mike", "C", 1, Arrays.asList(3, 2, 1))
        );

        List<Student> underachievers = students.stream()
                .filter(s -> s.getAverageGrade() < 3)
                .sorted(Comparator.comparing(Student::getName))
                .toList();

        underachievers.forEach(s -> System.out.println("List of underperforming students: " + s.getName()));

        students.stream()
                .filter(s -> s.getAverageGrade() >= 3)
                .forEach(s -> {
                    s.promote();
                    System.out.println(s.getName() + " transferred to the course " + s.getCourse());
                });

        Map<Integer, List<Student>> map = students.stream()
                .collect(Collectors.groupingBy(s -> (int) s.getAverageGrade()));

        map.forEach((key, value) -> {
            System.out.println("Lower limit of the average score: " + key);
            value.forEach(s -> System.out.println(s.getName()));
        });
    }
}
