package by.it.academy.task2;

public class UserRegistration {
    public static boolean checkLogInInfo(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!validateLogin(login)) {
            throw new WrongLoginException("Incorrect login");
        } else if (!validatePassword(password, confirmPassword)) {
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }

    public static boolean validateLogin(String login) {
        return login.matches("^[A-Za-z0-9_]{1,20}$");
    }

    public static boolean validatePassword(String password, String confirmPassword) {
        return password.matches("^[A-Za-z0-9_]{1,20}$") && password.equals(confirmPassword);
    }
}
