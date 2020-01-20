package Unit1.task8;

import java.util.Scanner;

public class Number_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int arr_length = in.nextInt();
        int[] arr = new int [arr_length];
        for (int i = 0; i < arr_length; i++) {
            int n =3 * i;
            arr[i] = 4 + n;
        }
        for (int i = 0; i < arr_length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

