package by.it.academy.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Mark mark = new Mark();
        School school = new School(students);

        for (int i = 0; i <= 10; i++) {
            students.add(new Student("Student " + (i + 1)));
            mark.addMark(students.get(i));
        }

        System.out.println("List of students in order of average score in biology: ");
        System.out.println(school.sortAscending(Subject.BIOLOGY));
        System.out.println();

        System.out.println("List of students in descending order of average grade in biology: ");
        System.out.println(school.sortDescending(Subject.BIOLOGY));
        System.out.println();

        System.out.println("Best sudents: " + school.getBestStudents());
        System.out.println();

        System.out.println("Worst students: " + school.getWorstStudents());
        System.out.println(students.get(0));
        System.out.println();

        System.out.println("Statistic: " + students.get(0).getStatistic());
    }
}
