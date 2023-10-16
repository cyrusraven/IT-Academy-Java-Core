package by.it.academy.task3;

public class Main{
        public static void main(String[] args) {
            // Примеры использования методов
            Interval interval1 = new Interval(2, 5, false, true);
            Interval interval2 = new Interval(3, 7, true, false);
            Interval interval3 = new Interval(8, 10, true, true);

            System.out.println("Интервал 1: " + interval1);
            System.out.println("Интервал 2: " + interval2);
            System.out.println("Интервал 3: " + interval3);

            System.out.println("Интервал 1 и Интервал 2 пересекаются: " + interval1.hasIntersection(interval2));
            System.out.println("Интервал 1 и Интервал 3 пересекаются: " + interval1.hasIntersection(interval3));

            Interval[] intervalsToMerge = {interval1, interval2, interval3};
            Interval[] mergedIntervals = Interval.mergeIntervals(intervalsToMerge);

            System.out.println("Объединение интервалов:");
            for (Interval interval : mergedIntervals) {
                System.out.println(interval);
            }

            Interval[] intervalsToIntersect = {interval1, interval2, interval3};
            Interval intersectionInterval = Interval.intersection(intervalsToIntersect);

            System.out.println("Пересечение интервалов: " + intersectionInterval);
        }
}
