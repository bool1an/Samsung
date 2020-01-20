package Unit1.task4;

import java.util.Scanner;

public class Number_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt ();
        int b = in.nextInt ();
        int c = 1;
        int d = 1<<b;
        a = a|d;
        System.out.println(a);
    }
}
