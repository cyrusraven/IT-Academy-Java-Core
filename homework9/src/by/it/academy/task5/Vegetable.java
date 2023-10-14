package by.it.academy.task5;

public class Vegetable extends Food{
    public Vegetable(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.VEGETABLE;
    }
}
