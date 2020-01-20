package Unit1.task11;

import java.util.Scanner;

public class Number_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        int [][] arr = new int [n][n];
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                arr[y][x] = in.nextInt();
            }
        }
        boolean flag = true;
        out:
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[0].length; x++) {
                if (y != x) {
                    if (arr[y][x] != arr[x][y]) {
                        flag = false;
                        break out;
                    }
                }
            }
        }
        if (flag) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
