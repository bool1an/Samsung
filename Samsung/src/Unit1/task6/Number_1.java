package Unit1.task6;

import java.util.Scanner;

public class Number_1 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();

        if (a>=10 && a<100) {
            System.out.println("NUM");
        } else if (a >= 0 && a<10) {
            System.out.println("DIGIT");
        }
        else {
            System.out.println("OTHER");
        }
    }
}
