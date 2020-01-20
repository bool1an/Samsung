package Unit1.task7;

import java.util.Scanner;

public class Number_3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        boolean a;
        boolean b;
        boolean d;
        int c = 0;
        do {
            x = in.nextInt();
            b = x>9 && x<100;
            if (b) {
                int c1 = x/10;
                int c2 = x%10;
                c = c + c1 + c2;
            }
        }
        while (b);

        System.out.println(c);
    }
}
