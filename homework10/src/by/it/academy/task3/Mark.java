package by.it.academy.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mark {
    public void addMark(Student student) {
        List<Integer> marks;
        if (student != null && School.students.contains(student)) {
            marks = addRandomMarks();
            student.getGrades().get(Subject.CHEMISTRY).addAll(marks);
            marks = addRandomMarks();
            student.getGrades().get(Subject.BIOLOGY).addAll(marks);
            marks = addRandomMarks();
            student.getGrades().get(Subject.ENGLISH).addAll(marks);
        }
    }

    public List<Integer> addRandomMarks() {
        Random random = new Random();
        List<Integer> randomMarks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomMarks.add(random.nextInt(10) + 1);
        }
        return randomMarks;
    }
}
