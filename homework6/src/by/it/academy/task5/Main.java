package by.it.academy.task5;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Earpods", 50.0, 4.8);
        Product product2 = new Product("iPhone 14", 2500.0, 4.8);
        Product product3 = new Product("Macbook air M1, 2020", 3500.0, 4.9);
        Product product4 = new Product("Xiaomi M8", 800.0, 4.5);
        Product product5 = new Product("Xiaomi redmi buds 4", 149.0, 4.3);
        Product product6 = new Product("Xiaomi RedmiBook Pro 14", 3000.0, 4.6);

        Category category1 = new Category("Смартфоны", new Product[]{product2, product4});
        Category category2 = new Category("Наушники", new Product[]{product1, product5});
        Category category3 = new Category("Ноутбуки", new Product[]{product3, product6});

        User user1 = new User("User1", "fkkpok");
        User user2 = new User("User2", "fkkfgfkf");
        User user3 = new User("User3", "ffgkfk");

        user1.getCart().addProduct(product1);
        user1.getCart().addProduct(product1);
        user2.getCart().addProduct(product2);
        user2.getCart().addProduct(product4);
        user3.getCart().addProduct(product3);
        user3.getCart().addProduct(product5);

        System.out.println("Каталог продуктов");
        for (Category category : new Category[]{category1, category2, category3}) {
            System.out.println(category.getName() + ":");
            for (Product product : category.getProducts()) {
                System.out.println(product.getName() + ", " + "цена: " + product.getPrice() +
                        ", " + "рейтинг: " + product.getRating());
            }
            System.out.println();
        }

        System.out.println("Покупки пользователей:");
        for (User user : new User[]{user1, user2, user3}) {
            System.out.println(user.getLogin() + " корзина:");
            for (CartItem cartItem : user.getCart().getCartItem()) {
                System.out.println(cartItem.toString());
            }
            System.out.println();
        }
    }
}
