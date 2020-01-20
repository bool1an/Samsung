package Unit1.task11;

import java.util.Scanner;

public class Number_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthY = in.nextInt();
        int lengthX = in.nextInt();
        int[][] arr = new int[lengthY][lengthX];
        int x = 0;
        for (int y = 0; y < lengthY; y++) {
            for (x = 0; x < lengthX; x++) {
            arr[y][x] = in.nextInt();
            }
        }
        conclusion(editNewArr(arr));
    }
    public static int[][] editNewArr(int[][] arr) {
        int[][] arrNew = new int [arr[0].length][arr.length];
        int counterX = 0;
        int counterY = 0;
        for (int x = 0; x < arr[0].length; x++) {
            counterX = 0;
            for (int y = arr.length - 1; y != -1; y--) {
                arrNew[counterY][counterX] = arr[y][x];
                counterX++;
            }
            counterY++;
        }
        return arrNew;
    }

    public static void conclusion (int[][] arr) {
        System.out.println(arr.length + " " + arr[0].length) ;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
