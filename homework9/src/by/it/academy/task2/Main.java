package by.it.academy.task2;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Double> pair = new Pair<>(10, 5.5);
        System.out.println(pair.first());
        System.out.println(pair.last());

        System.out.println(pair);
        Pair<Double, Integer> newPair = pair.swap();
        System.out.println(newPair);

        System.out.println(pair.replaceFirst(5));
        System.out.println(pair.replaceLast(71.7));
    }
}
