package by.it.academy.task4;

public class Main {
    public static void main(String[] args) {
        BooleanArray boolArray = new BooleanArray();

        boolArray.add(true);
        boolArray.add(false);
        boolArray.add(true);

        int arraySize = boolArray.getSize(); // Получить размер массива
        System.out.println("Size: " + arraySize);

        boolArray.add(2, false);
        boolArray.set(0, false);
        boolArray.remove(3);

        System.out.println("Boolean Array after modifications: " + boolArray);
        System.out.println("Size after modifications: " + arraySize);
    }
}
