package by.it.academy.task5;

public class Chicken extends Food {
    public Chicken() {
        super("Chicken");
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.MEAT;
    }
}
