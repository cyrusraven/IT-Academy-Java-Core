package by.it.academy.task2;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private int birthDate;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private String group;

    // Геттеры
    public String getFaculty() {
        return faculty;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    // Конструкторы
    public Student(int id, String lastName, String firstName, String middleName, int birthDate, String address,
                   int phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    // Геттеры и сеттеры (можно сгенерировать автоматически в среде разработки)

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
