package Unit1.task7;

import java.util.Scanner;

public class Number_9 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt ();
        int b = 10;
        while (x>0) {
            int n = x % 10;
            x = x / 10;
            if (b > n && n != 0) {
                b=n;
            }
        }
        System.out.println(b);
    }
}
