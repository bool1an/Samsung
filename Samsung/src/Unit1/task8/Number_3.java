package Unit1.task8;

import java.util.Locale;
import java.util.Scanner;

public class Number_3 {
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int arr_length = in.nextInt ();
        float sum = 0;
        int n = 0;
        int[] arr = new int [arr_length];
        for (int i = 0; i < arr_length ; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : arr) {
            if (x % 2 == 1 || x % 2 == -1) {
                sum += x;
                n += 1;
            }
        }

        if (n == 0) {
            System.out.println("NO");
        }
        else {
            sum = sum/n;
            System.out.printf("%.2f", sum);
        }
    }
}