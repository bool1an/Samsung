package Unit1.task4;

import java.util.Scanner;

public class Number_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt ();
        int b = in.nextInt ();
        int c = ~0;
        c = c<<b;
        a = a&c;
        System.out.println(a);
    }
}
