import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 7, 45, 10, 1, 11, 9, 18};
        int[][] arr1 = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] < arr[j]) {
                    count++;
                }
            }
            int[] row = new int[count];
            int index = 0;
            for (int j : arr) {
                if (arr[i] < j) {
                    row[index++] = j;
                }
            }
            arr1[i] = row;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr1[i]));
            System.out.println();
        }
    }
}
