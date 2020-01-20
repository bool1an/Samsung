package Unit1.task7;

import java.util.Scanner;

public class Number_2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int a;
//        int x = in.nextInt();
//        int a = x % 5;
        int c = 0;
        do {
            x = in.nextInt();
            if (x>10) {
                c = c + x;
            }

            a = x % 5;
        }
        while (a != 0);

        System.out.println(c);
    }
}

