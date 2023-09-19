public class Task1 {
    public static void main(String[] args) {
        double[] arr = new double[20];
        fillArray(arr);
        printMaxOfArray(arr);
        printMinOfArray(arr);
        printAverageOfArray(arr);
    }

    static void fillArray(double[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 30;
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    static void printMaxOfArray(double[] arr) {
        double max = arr[0];
        for (double v : arr) {
            if (max < v) {
                max = v;
            }
        }
        System.out.println("Максимальный элемент: " + max);
    }

    static void printMinOfArray(double[] arr) {
        double min = arr[0];
        for (double v : arr) {
            if (min > v) {
                min = v;
            }
        }
        System.out.println("Минимальный элемент: " + min);
    }

    static void printAverageOfArray(double[] arr) {
        double average = 0;
        for (double v : arr) {
            average += v;
        }
        System.out.println("Среднее арифметическое элементов массива: " + average / arr.length);
    }
}
