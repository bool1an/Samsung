package Unit1.task7;

import java.util.Scanner;

public class Number_8 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt ();
        int b = 10;
        while (x>0) {
            int n = x % 10;
            x = x / 10;
            if (n%2 != 0 && b>n) {
                b = n;
            }

        }
        if (b == 10) {
            System.out.println("NO");
        }
        else System.out.println(b);
    }
}
