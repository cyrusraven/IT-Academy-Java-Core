package by.it.academy.task1;

public class Student extends Person {
    private int year;

    public Student(String name, int age, String gender, double weight, int year) {
        super(name, age, gender, weight);
        this.year = year;
    }

    public int setYear() {
        int yearCount = 0;
        while (yearCount < 4) {
            year++;
            yearCount++;
        }
        return year;
    }

    @Override
    public String toString() {
        return "имя: " + getName() + "\n" +
                "возраст: " + getAge() + "\n" +
                "пол: " + getGender() + "\n" +
                "вес: " + getWeight() + " кг" + "\n" +
                "годы обучения: " + year + "-" + setYear();
    }
}
