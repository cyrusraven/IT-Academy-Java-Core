package by.it.academy.task3;

public class Chicken extends FarmAnimal {
    public static final String PRODUCT_NAME = "яйца";
    public static final String PRODUCT_UNIT = "шт.";

    public Chicken() {
        super("Курица", PRODUCT_NAME, 35, PRODUCT_UNIT);
    }
}
