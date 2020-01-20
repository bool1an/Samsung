package Unit1.task4;

import java.util.Scanner;

public class Number_6 {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int a =in.nextInt ();
        int b =a-1;
        a = a&b;
        if (a==0) {
            System.out.println ("YES");
        }
        else {
            System.out.println ("NO");
        }
    }
}
