package Unit1.task8;

import java.util.Scanner;

public class Number_7 {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int c = 0;
    int index = 0;
    int array_length = in.nextInt();
    int[] arr = new int[array_length];
    for (int i = 0; i < array_length; i++) {
        arr[i] = in.nextInt();
    }
    int[] new_arr =  new int[array_length];
    for (int i = 0; i < array_length; i++) {
        if (arr[i] < 0) {
            new_arr[c] = arr[i];
            c++;
            }
    }
    for (int i = 0; i < array_length; i++) {
            if (arr[i] >= 0) {
            new_arr[c + index] = arr[i];
            index++;
            }
    }
    for (int i = 0; i < array_length; i++) {
        System.out.print(new_arr[i] + " ");
        }
    }
}
