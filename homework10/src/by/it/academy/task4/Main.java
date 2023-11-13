package by.it.academy.task4;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        SortedList<Integer> sortedList = new SortedList<>();
        sortedList.add(1);
        sortedList.add(8);
        sortedList.add(5);
        sortedList.add(11);
        sortedList.add(3);
        sortedList.add(7);

        System.out.println("Sorted list: " + sortedList);

        Comparator<Integer> reverseComparator = Collections.reverseOrder();
        sortedList.setComparator(reverseComparator);

        System.out.println("Reversed sorted list: " + sortedList);
    }
}
