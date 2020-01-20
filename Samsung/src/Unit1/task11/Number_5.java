package Unit1.task11;

import java.util.Scanner;

public class Number_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int counter = 0;
        int value = 0;
        int i = 0;
        int a = 0;
        int[][] arr = new int[n][m];
        for (i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = value;
                    value++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    arr[i][j] = value;
                    value++;
                }
            }
        }
        conclusion(arr);
    }

    private static void conclusion(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%3d", ints[j]);
            }
            System.out.println();
        }
    }
}
