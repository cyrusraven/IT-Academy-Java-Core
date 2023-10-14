package by.it.academy.task5;

public class Main {
    public static void main(String[] args) {
        Food vegetable = new Vegetable("Tomato");
        Food fruit = new Fruit("Banana");
        Food meat = new Meat("Chicken");

        Food[] foods = {vegetable, fruit, meat};

        Check check = new Check();
        boolean isVegetarian = check.isVegetarian(foods);

        System.out.println("Все продукты вегетарианские? Ответ: " + isVegetarian);
    }
}
