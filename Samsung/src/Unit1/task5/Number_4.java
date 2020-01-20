package Unit1.task5;

import java.util.Locale;
import java.util.Scanner;

public class Number_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int a = in.nextInt();
        int c = a % 5;
        boolean b2 = a >= 100 && a < 1000;
        boolean c1 = c == 0;
        System.out.println(b2&&c1 ? true : false);

    }
}