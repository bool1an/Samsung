package Unit1.task9;

import java.util.Scanner;

public class Number_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = in.nextInt();
        }
        printArr(getArr(arr));
    }
    public static int[] getArr(int[] arr) {
        int minValue = arr[0];
        int IndexMinValue = 0;
        int saver;
        for (int i = 0; i < arr.length; i++) {
            if (minValue > arr[i]) {
                IndexMinValue = i;
                minValue = arr[i];
            }
        }
        int n = 0;
        for (int i = 0; i < IndexMinValue; i++) {
        arr[IndexMinValue - n] = arr[IndexMinValue - n - 1];
        n++;
        }
        arr[0] = minValue;
        return arr;
    }
    public static void printArr(int[] arr) {
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
}
