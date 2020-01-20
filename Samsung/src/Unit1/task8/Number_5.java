package Unit1.task8;

import java.util.Scanner;

public class Number_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr_length = in.nextInt ();
        int x = 0;
        int n = 0;
        int[] arr = new int[arr_length];
        for (int i = 0; i < arr_length ; i++) {
            arr [i] = in.nextInt();
        }
        for (int i = 0; i < arr_length/2; i++) {
            x = arr[i];
            n = arr[arr_length - i - 1];
            arr[i] = n;
            arr[arr_length - i - 1] = x;
        }
        for (int i = 0; i < arr_length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

