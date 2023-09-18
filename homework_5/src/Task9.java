import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 4, 2, 10};
        boolean[] arr1 = new boolean[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr1[i]) {
                int number = arr[i];
                for (int j = i + 1; j < arr1.length; j++) {
                    if (!arr1[j]) {
                        if (number == arr[j]) {
                            arr1[j] = true;
                            count++;
                        }
                    }
                }
            }
        }
        int[] arr2 = new int[arr.length - count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr1[i]) {
                arr2[count] = arr[i];
                count++;
            }
        }
        System.out.print(Arrays.toString(arr2));
    }
}
