package by.it.academy.task2;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student(1, "Иванов", "Иван", "Иванович", 2000,
                "Минск", 6667606,
                "Экономический", 3, "AT-322");
        students[1] = new Student(2, "Петров", "Петр", "Петрович",
                1999, "Гомель", 9277606,
                "Экономический", 4, "AT-322");
        students[2] = new Student(3, "Сидоров", "Дмитрий", "Дмитриевич",
                2001, "Могилев", 7277190,
                "Экономический", 2, "AB-222");
        students[3] = new Student(4, "Куропаткин", "Анатолий", "Анатольевич",
                2002, "Гродно", 6667190,
                "Исторический", 3, "НF-362");

        // Список студентов заданного факультета
        String targetFaculty = "Экономический";
        System.out.println("Список студентов факультета " + targetFaculty + ":");
        for (Student student : students) {
            if (student.getFaculty().equals(targetFaculty)) {
                System.out.println(student);
            }
        }

        // Список студентов для каждого факультета и курса
        System.out.println("\nСписки студентов по факультетам и курсам:");
        for (Student student : students) {
            System.out.println("Факультет: " + student.getFaculty() + ", Курс: " + student.getCourse() + " - "
                    + student.getLastName() + " " + student.getFirstName());
        }

        // Список студентов, родившихся после заданного года
        int targetYear = 2000;
        System.out.println("\nСписок студентов, родившихся после " + targetYear + " года:");
        for (Student student : students) {
            if (student.getBirthDate() > targetYear) {
                System.out.println(student);
            }
        }

        // Список учебной группы
        String targetGroup = "AT-322";
        System.out.println("\nСписок студентов из группы " + targetGroup + ":");
        for (Student student : students) {
            if (student.getGroup().equals(targetGroup)) {
                System.out.println(student);
            }
        }
    }
}
