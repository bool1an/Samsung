package Unit1.task7;

import java.util.Scanner;

public class Number_7 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt ();
        int i = 1;
        i = i*10;
        int b = 1;
        while (i<=x) {
            i = i*10;
            b++;

        }
        System.out.println(b);
    }
}