package by.it.academy.task1;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.concurrent.Callable;

public class RowsCalculate implements Callable<Integer> {
    int[][] matrix;

    public RowsCalculate(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public Integer call() {
        return Arrays.stream(matrix).map(a -> Arrays.stream(a).reduce((b, c) -> b * c)).
                map(OptionalInt::getAsInt).reduce(Integer::sum).orElseThrow(NumberFormatException::new);
    }
}
