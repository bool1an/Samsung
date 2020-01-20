package Unit1.task2;

import java.text.DecimalFormat;
import java.util.Scanner;



public class Number_5 {

    static public void customFormat(String pattern, double value ) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.print(output);
    }



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int ss = s.nextInt();
        int m = 0;
        int h = 0;

        while(ss >=60) {
            m++;
            ss = ss - 60;
            while (m >=60) {
                h++;
                m = m - 60;
                if (h >= 24) {
                    h = h - 24;
                }
            }
        }

        customFormat("0", h);
        System.out.print(":");
        customFormat("00", m);
        System.out.print(":");
        customFormat("00", ss);




    }
}
