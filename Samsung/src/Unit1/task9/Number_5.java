package Unit1.task9;

import java.util.Scanner;

public class Number_5 {
    public static double getAverage(int[] arr) {
        double sum = 0;
        int count = 0;
        for (int value: arr) {
            if (value > 999 && value < 10000) {
                count++;
                sum += value;
            }
        }
        return (count != 0) ? sum / count : -1;
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = in.nextInt();
        }
        double average = getAverage(arr);
        System.out.printf("%.2f", getAverage(arr));
    }
}

