package by.it.academy.task2;

public class Main {
    public static void main(String[] args) {
        String login = "AliceBlack_2023";
        String password = "2234Y_56";
        String confirmPassword = "2234Y_56";

        boolean res = UserRegistration.registration(login, password, confirmPassword);

        if (res) {
            System.out.println("Welcome, " + login + "!");
        } else {
            System.out.println("Ops, try again.");
        }
    }
}
