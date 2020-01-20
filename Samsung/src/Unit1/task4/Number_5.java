package Unit1.task4;

import java.util.Scanner;

public class Number_5 {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int a =in.nextInt ();
        int b =in.nextInt ();
        int a2 =0;
        a2=~a2;
        a2 = a2<<b;
        a2=~a2;
        a = a&a2;
        System.out.println (a);
    }
}
