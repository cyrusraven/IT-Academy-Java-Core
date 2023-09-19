import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 1, 8, 1}, {30, 14, 21, 2}};
        int[][] newArr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[j][i] = arr[i][j];
            }
        }
        for (int[] ints : newArr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
