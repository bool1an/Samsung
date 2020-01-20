package Unit1.task5;

import java.util.Locale;
import java.util.Scanner;

public class Number_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int a = in.nextInt ();
        int a2 = in.nextInt ();
        int a3 = in.nextInt ();
        a = a%2;
        a2 = a2%2;
        a3 = a3%2;
        boolean b = a==0;
        boolean b2 = a2==0;
        boolean b3 = a3==0;
        boolean c = b&&b2||b&&b3||b2&&b3;
        System.out.println(c ? true : false);


    }
}
