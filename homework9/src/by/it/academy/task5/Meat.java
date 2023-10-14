package by.it.academy.task5;

public class Meat extends Food {
    public Meat(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.MEAT;
    }
}
