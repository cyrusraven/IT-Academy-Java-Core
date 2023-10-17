package by.it.academy.task3;

public abstract class FarmAnimal {
    private final String name;
    private final String product;
    private final int productivityPerWeek;
    private final String unit;

    public FarmAnimal(String name, String productUnit, int productivityPerWeek, String unit) {
        this.name = name;
        this.product = productUnit;
        this.productivityPerWeek = productivityPerWeek;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public int getProductivityPerWeek() {
        return productivityPerWeek;
    }

    public String getUnit() {
        return unit;
    }
}
