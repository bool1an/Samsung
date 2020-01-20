package Unit1.task8;

import java.util.Scanner;

public class Number_1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int index = -1;
        int i;
        int x = in.nextInt();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i + 1;
                break;
            }
        }
        if (index != -1) {
            System.out.println(index);
        }
        else System.out.println("NO");

    }
}