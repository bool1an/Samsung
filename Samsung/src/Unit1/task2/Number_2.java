package Unit1.task2;

import java.util.Scanner;

public class Number_2 {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        int a =e;
        a = a % 10;
        int b =e;
        b = b % 100;
        b = b-a;
        b = b/10;
        int c =e;
        c = c-(a+b);
        c = c/100;
        int d =a+b+c;
        System.out.println(d);
    }
}
