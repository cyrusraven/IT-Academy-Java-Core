package by.it.academy.task5;

public class CartItem {
    private Product products;
    private int count;

    public CartItem(Product products, int count) {
        this.products = products;
        this.count = count;
    }

    public Product getProducts() {
        return products;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return products.getName() + " x " + count;
    }
}
