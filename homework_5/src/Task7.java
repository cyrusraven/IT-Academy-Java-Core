import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 7, 1, 15, 2, 4, 11, 10, 30};
        System.out.println(getMedian(arr));
    }

    public static int getMedian(int[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            return (arr[arr.length / 2]);
        } else {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2] / 2);
        }
    }
}
