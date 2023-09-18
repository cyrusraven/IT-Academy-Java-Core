import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 1, 8, 10, 2, 5, 9, 7, 3};
        //сортировка выбором
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int min = i;
                if (arr[i] > arr[j]) {
                    min = arr[j];
                }
                if (min != i) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[]{4, 6, 1, 8, 10, 2, 5, 9, 7, 3};
        //сортировка пузырьком
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j + 1] < arr1[j]) {
                    int swap = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {4, 6, 1, 8, 10, 2, 5, 9, 7, 3};
        int[] result = mergeSort(arr2);
        System.out.println(Arrays.toString(result));
    }

    //сортировка слиянием
    public static int[] mergeSort(int[] arr2) {
        int[] subArr1 = Arrays.copyOf(arr2, arr2.length);
        int[] subArr2 = new int[arr2.length];
        return mergeSortInner(subArr1, subArr2, 0, arr2.length);
    }

    public static int[] mergeSortInner(int[] subArr1, int[] subArr2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return subArr1;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(subArr1, subArr2, startIndex, mid);
        int[] sorted2 = mergeSortInner(subArr1, subArr2, mid, endIndex);
        int index1 = startIndex;
        int index2 = mid;
        int destIndex = startIndex;
        int[] result = sorted1 == subArr1 ? subArr2 : subArr1;
        while (index1 < mid && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < mid) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
