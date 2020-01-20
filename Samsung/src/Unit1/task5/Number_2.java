package Unit1.task5;

import java.util.Locale;
import java.util.Scanner;

public class Number_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        boolean b = a<=5 && a>=-3;
        boolean c = a>=9&&a<=15;
        System.out.println(b||c ? true : false);

    }
}