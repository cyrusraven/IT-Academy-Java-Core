package by.it.academy.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School {
    public static List<Student> students;

    public School(List<Student> students) {
        School.students = students;
    }

    public List<Student> sortAscending(Subject subject) {
        students.sort(Comparator.comparingDouble(o -> o.getAverageGradeInTheSubject(subject)));
        return students;
    }

    public List<Student> sortDescending(Subject subject) {
        Collections.reverse(sortAscending(subject));
        return students;
    }

    public void sortAverage() {
        students.sort(Comparator.comparingDouble(Student::getAverageGrade));
    }

    public List<Student> getWorstStudents() {
        sortAverage();
        List<Student> worstStudents = new ArrayList<>();
        worstStudents.add(students.get(0));
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() == worstStudents.get(0).getAverageGrade()) {
                worstStudents.add(students.get(i));
            }
        }
        return worstStudents;
    }

    public List<Student> getBestStudents() {
        sortAverage();
        List<Student> bestStudents = new ArrayList<>();
        bestStudents.add(students.get(students.size() - 1));
        for (int i = 0; i < students.size() - 1; i++) {
            if (students.get(i).getAverageGrade() == bestStudents.get(0).getAverageGrade()) {
                bestStudents.add(students.get(i));
            }
        }
        return bestStudents;
    }
}
