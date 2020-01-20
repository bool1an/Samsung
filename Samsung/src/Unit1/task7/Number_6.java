package Unit1.task7;

import java.util.Scanner;

public class Number_6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt ();
        int b = 0;
        int i=26;
        while (i<=x) {
            b=b+i;
            i = i+2;
        }
        System.out.println(b);
    }
}