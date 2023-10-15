package by.it.academy.task5;

public class Banana extends Food {
    public Banana() {
        super("Banana");
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.FRUIT;
    }
}
