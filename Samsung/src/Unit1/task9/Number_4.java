package Unit1.task9;

import java.util.Locale;
import java.util.Scanner;

public class Number_4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        double get_d = in.nextDouble();
        int get = in.nextInt();
        for (int i = 0; i < get ; i++) {
            get_d = get_d * 2;
            int c = 0;
            c = (int) (get_d / 1);
            get_d = get_d % 1;
            System.out.print(c);
        }
    }
}
