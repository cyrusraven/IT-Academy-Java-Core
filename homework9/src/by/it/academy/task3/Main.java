package by.it.academy.task3;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 4, 6, 9, 8, 9};
        Array<Integer> array = new Array<>(intArray);

        System.out.println(array.getElement(1));

        array.putElement(3, 5);

        while (array.hasNext()) {
            System.out.print(array.next() + " ");
        }
    }
}
