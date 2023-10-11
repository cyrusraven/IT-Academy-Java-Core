package by.it.academy.task1;

public class Student extends Person {
    private int year;

    public Student(String name, int age, String gender, double weight, int year) {
        super(name, age, gender, weight);
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int incYear() {
       return year++;
    }

    public int getYear() {
        return year;
    }
}
