package Unit1.task7;

import java.util.Scanner;

public class Number_10 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt ();
        while (x < 30000000 ) {
            x++;
            int d = 2;
            while (x % d != 0) {
                d++;
            }
            if (x == d) {
                break;
            }
        }

        System.out.println(x);
    }
}