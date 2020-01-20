package Unit1.task7;

import java.util.Scanner;

public class Number_4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt ();
        int c = in.nextInt();
        int a = 0;
        int b = x;
        int d = 0;
        while (b>=c) {
            b = b-c;
            a++;
        }
        System.out.println(a + " " + b);
    }
}