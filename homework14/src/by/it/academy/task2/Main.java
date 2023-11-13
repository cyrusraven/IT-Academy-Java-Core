package by.it.academy.task2;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 11);
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
