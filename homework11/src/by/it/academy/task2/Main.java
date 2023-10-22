package by.it.academy.task2;

public class Main {
    public static void main(String[] args) {
        String login = "AliceBlack_2023";
        String password = "2234Y_56";
        String confirmPassword = "2234Y_56";

        boolean res = false;
        try {
            res = UserRegistration.checkLogInInfo(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        if (res) {
            System.out.println("Welcome, " + login + "!");
        } else {
            System.out.println("Oops, try again.");
        }
    }
}
