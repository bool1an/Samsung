package Unit1.task7;

import java.util.Scanner;

public class Number_5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt ();
        int a=x;
        int i = 0;
        while (a > 0) {
            a=a/2;
            i++;
        }
        System.out.println(i);
    }
}
