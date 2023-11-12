package by.it.academy.task3;

import java.util.*;

public class Student {
    private final String name;

    private final Map<Subject, List<Integer>> grades;
    public Student(String name) {
        this.name = name;
        grades = new EnumMap<>(Subject.class);
        grades.put(Subject.CHEMISTRY, new LinkedList<>());
        grades.put(Subject.BIOLOGY, new LinkedList<>());
        grades.put(Subject.ENGLISH, new LinkedList<>());
    }


    public double getAverageGradeInTheSubject(Subject subject) {
        double sum = 0.0;

        List<Integer> marks = grades.get(subject);
        for (Integer mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    public double getAverageGrade() {
        double sum = 0;
        int count = 0;
        for (List<Integer> marks : grades.values()) {
            for (Integer mark : marks) {
                sum += mark;
                count++;
            }
        }
        return sum / count;
    }

    public Map<Subject, Map<Integer, Integer>> getStatistic() {
        Map<Subject, Map<Integer, Integer>> statistics = new HashMap<>();
        for (Map.Entry<Subject, List<Integer>> entry : grades.entrySet()) {
            Subject subject = entry.getKey();
            List<Integer> marks = entry.getValue();
            Map<Integer, Integer> markCount = new HashMap<>();

            for (Integer mark : marks) {
                markCount.put(mark, markCount.getOrDefault(mark, 0) + 1);
            }
            statistics.put(subject, markCount);
        }
        return statistics;
    }

    public Map<Subject, List<Integer>> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return  name + " grades: " + grades;
    }
}
