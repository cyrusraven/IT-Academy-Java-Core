package by.it.academy.task2;

public class UserRegistration {
    public static boolean registration(String login, String password, String confirmPassword) {
        try {
            if (!isRightLogin(login)) {
                throw new WrongLoginException("Wrong login.");
            }
            if (!isRightPassword(password, confirmPassword)) {
                throw new WrongPasswordException("Wrong password.");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException w) {
            System.out.println(w.getMessage());
            return false;
        }
    }

    public static boolean isRightLogin(String login) {
        return login.matches("^[A-Za-z0-9_]{1,20}$");
    }

    public static boolean isRightPassword(String password, String confirmPassword) {
        return password.matches("^[A-Za-z0-9_]{1,20}$") && password.equals(confirmPassword);
    }
}
