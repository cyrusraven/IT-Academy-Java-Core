package by.it.academy.task5;

public class Check {
    public boolean isVegetarian(Food[] foods) {
        for (Food food : foods) {
            if (food.getFoodType() != FoodType.VEGETABLE && food.getFoodType() != FoodType.FRUIT) {
                return false;
            }
        }
        return true;
    }
}