package by.it.academy.task5;

public class Fruit extends Food {
    public Fruit(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.FRUIT;
    }
}
