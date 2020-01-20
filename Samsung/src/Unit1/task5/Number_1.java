package Unit1.task5;

import java.util.Locale;
import java.util.Scanner;

public class Number_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        in.useLocale(Locale.US);
        System.out.println((a<=8 && a>=3) ? true : false);

    }
}
