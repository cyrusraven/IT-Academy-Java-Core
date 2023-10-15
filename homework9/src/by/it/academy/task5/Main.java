package by.it.academy.task5;

public class Main {
    public static void main(String[] args) {
        Food vegetable = new Tomato();
        Food fruit = new Banana();
        Food meat = new Chicken();

        Food[] foods = {vegetable, fruit, meat};

        Checker check = new Checker();
        boolean isVegetarian = check.isVegetarian(foods);

        System.out.println("Все продукты вегетарианские? Ответ: " + isVegetarian);
    }
}
