import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BubbleSort");
        System.out.println("Wpisz długość tablicy: ");
        int arraySize = scanner.nextInt();
        double[] arr = new double[arraySize];
        createArray(arr);
        bubbleSort(arr, arr.length);
    }

    static void bubbleSort(double[] arr, int n) {
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(Math.round(arr[i]* 100.0)/100.0 + " ");

        }
        System.out.println();
    }
    public static double[] createArray(double arr[]) {
        int max = 70;
        int min = 30;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * (max - min) + min;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(Math.round(arr[i]* 100.0)/100.0 + " ");

        }
        return arr;
    }
}




