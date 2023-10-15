package by.it.academy.task5;

public class Tomato extends Food {
    public Tomato() {
        super("Tomato");
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.VEGETABLE;
    }
}
