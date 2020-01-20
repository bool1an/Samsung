package Unit1.task11;

import java.util.Scanner;

public class Number_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int counter = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; counter < arr.length & i < arr[0].length; i++) {
                arr[counter][i] = counter * i;
                if (i == m - 1) {
                    i = 0;
                    counter++;
                }
        }
        conclusion(arr);
    }

    private static void conclusion(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%4d", ints[j]);
            }
            System.out.println();
        }
    }
}
