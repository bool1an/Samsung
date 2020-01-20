package Unit1.task8;

import java.util.Scanner;

public class Number_2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int arr_length = in.nextInt ();
        int[] arr = new int [arr_length];
        for (int i = 0; i < arr_length ; i++) {
            arr[i] = in.nextInt();
        }
        int  even = 0;
        int n = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                even = even + arr[i];
                n = n + 1;
            }
        }
        if (n != 0) {
            System.out.println(even);
        }
        else {
            System.out.println("NO");
        }
    }
}
