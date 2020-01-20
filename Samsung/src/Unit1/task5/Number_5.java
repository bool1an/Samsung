package Unit1.task5;

import java.util.Locale;
import java.util.Scanner;

public class Number_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int a = in.nextInt ();
        int a2 = in.nextInt ();
        int a3 = in.nextInt ();
        int a4 = in.nextInt ();
        int c = a*-1;
        boolean b = c==a2||c==a3||c==a4;
        int c2 = a2*-1;
        boolean b2 = c2==a||c2==a3||c2==a4;
        int c3 = a3*-1;
        boolean b3 = c3==a||c3==a2||c3==a4;
        int c4 = a4*-1;
        boolean b4 = c4==a||c4==a2||c4==a3;
        System.out.println(b||b2||b3||b4 ? true : false);
    }
}
