package Unit1.task4;

import java.util.Scanner;

public class Number_4 {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int a =in.nextInt ();
        int b =in.nextInt ();
        int a2 = 1;
        a2 = a2<<b;
        a = a^a2;
        System.out.println (a);
    }
}
