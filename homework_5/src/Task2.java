import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 55, 1, 55, 2, 45, 78, 13, 1, 1, 78, 1};
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
            }
        }

        int tmp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = tmp;

        System.out.print(Arrays.toString(arr));
    }
}
