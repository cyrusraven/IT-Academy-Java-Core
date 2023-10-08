package by.it.academy.task1;

public class Main {
    public static void main(String[] args) {
        Person student1 = new Student("Владислав Петров", 22, "м", 70.5, 2022);
        Person student2 = new Student("Карина Сечко", 21, "ж", 55.0, 2021);
        Person student3 = new Student("Артем Лапицкий", 23, "м", 85.0, 2023);
        Person student4 = new Student("Дарья Шилович", 20, "ж", 62.0, 2020);

        System.out.println("Студенты: ");
        for (Person person : new Person[]{student1, student2, student3, student4}) {
            System.out.println(person.toString() + "\n");
        }
    }
}
