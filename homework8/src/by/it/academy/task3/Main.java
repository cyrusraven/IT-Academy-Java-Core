package by.it.academy.task3;

public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Duck duck = new Duck();
        Goose goose = new Goose();
        Cow cow = new Cow();
        Sheep sheep = new Sheep();

        Farm farm = new Farm(chicken, goose, duck, cow, sheep);
        farm.print();
        farm.getProduct();
    }
}
