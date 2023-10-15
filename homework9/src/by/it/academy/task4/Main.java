package by.it.academy.task4;

public class Main {
    public static void main(String[] args) {
        Integer[][] array = new Integer[][]{
                {4, 7},
                {1, 8 , 5},
                {10, 2, 16, 3}
        };

        Matrix<Integer> arrayIterator = new Matrix<>(array);
        while (arrayIterator.hasNext()) {
            System.out.print(arrayIterator.next() + " ");
        }
    }
}
