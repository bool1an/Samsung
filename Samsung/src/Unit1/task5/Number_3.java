package Unit1.task5;

import java.util.Locale;
import java.util.Scanner;

public class Number_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        boolean b = a<=3 && a>=-2;
        boolean c = a>=6&&a<=9;
        System.out.println(b||c ? false : true);

    }
}
