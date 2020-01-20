package Unit1.task6;

import java.util.Scanner;

public class Number_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat ();
        float b = in.nextFloat ();
        if (a == 0 && b<= 0 || a<0 && b<0) {
            System.out.println("no such x");
        }
        else if (a>=0 && b>0){
            System.out.println("any x");
        }
        else if (a > 0 && b<0) {
            float f = b/a;
            float f1 = f*-1;
            System.out.printf("x<%.1f or x>%.1f", f, f1);
        }
        else if (a < 0 && b >0) {
            float f = b/a;
            float f1 = f*-1;
            System.out.printf("%.1f<x<%.1f", f, f1);
        }
    }
}
