package by.it.academy.task1;

public class StackOverflowErrorExample {
    public static void main(String[] args) {
        StackOverflowErrorExample.recursivePrint(1);
    }

    public static void recursivePrint(int num) {
        recursivePrint(++num);
    }
}

