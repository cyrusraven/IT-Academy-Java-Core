package by.it.academy.task5;

public class Cart {
    private CartItem[] cartItem;

    public Cart() {
        this.cartItem = new CartItem[0];
    }

    public void addProduct(Product product) {
        for (CartItem cartItem: cartItem) {
            if (cartItem.getProducts().getName().equals(product.getName())) {
                cartItem.setCount(cartItem.getCount() + 1);
                return;
            }
        }
        CartItem[] newItems = new CartItem[cartItem.length + 1];
        System.arraycopy(cartItem, 0, newItems, 0, cartItem.length);
        newItems[cartItem.length] = new CartItem(product, 1);
        cartItem = newItems;
    }

    public CartItem[] getCartItem() {
        return cartItem;
    }
}
