package by.it.academy.task5;

public class User {
    private String login;
    private String password;
    private Cart cart;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.cart = new Cart();
    }

    public String getLogin() {
        return login;
    }

    public Cart getCart() {
        return cart;
    }
}
