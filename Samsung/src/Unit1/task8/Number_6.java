package Unit1.task8;

import java.util.Scanner;

public class Number_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int a = 0;
        int b = 0;
        int arr_length = in.nextInt ();
        int[] arr = new int[arr_length];
        for (int i = 0; i < arr_length ; i++) {
            arr [i] = in.nextInt();
        }
        int maxCount = 0;
        int maxValue = Integer.MIN_VALUE;

        for(int value: arr) {
            int count = 1;
            for(int v: arr) {
                if (v == value) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
                maxValue = value;
            }
        }
        System.out.println(maxValue);
    }
}

