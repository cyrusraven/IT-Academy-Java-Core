package by.it.academy.task3;

public class Cow extends FarmAnimal {
    public static final String PRODUCT_NAME = "молоко";
    public static final String PRODUCT_UNIT = "л";

    public Cow() {
        super("Корова", PRODUCT_NAME, 105, PRODUCT_UNIT);
    }
}
