import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 55, 1, 55, 2, 45, 78, 13, 1, 1, 78, 1};
        int max = arr[0];
        int min = arr[0];
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                indexOfMax = i;
            }
            if (min > arr[i]) {
                min = arr[i];
            } else if (min == arr[i]) {
                indexOfMin = i;
            }
        }
        int temp = arr[indexOfMin];
        arr[indexOfMin] = arr[indexOfMax];
        arr[indexOfMax] = temp;

        System.out.print(Arrays.toString(arr));
    }
}
