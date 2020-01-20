package Unit1.task11;

import java.util.Scanner;

public class Number_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int [n][n];
        int i = 0;
        for (int j = arr.length - 1; j != -1; j--) {
            arr[i][j] = 1;
            i++;
            for (int k = i ; k < arr.length; k++) {
            arr[k][j] = 2;
            }
        }
        conclusion(arr);
    }
    public static void conclusion (int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
