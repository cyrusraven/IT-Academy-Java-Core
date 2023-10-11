package by.it.academy.task3;

public class Duck extends FarmAnimal {
    public static final String PRODUCT_NAME = "яйца";
    public static final String PRODUCT_UNIT = "шт.";
    public Duck() {
        super("Утка", PRODUCT_NAME, 42, PRODUCT_UNIT);
    }
}
