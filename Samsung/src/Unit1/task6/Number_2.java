package Unit1.task6;

import java.util.Scanner;

public class Number_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a>b && a>c) {
            if (b > c) {
                System.out.println(c + " " + b + " " + a);
            }
            else System.out.println(b + " " + c + " " + a);
        }
        else if (b > c && b > a) {
            if (c > a) {
                System.out.println(a + " " + c + " " + b);
            }
            else System.out.println(c + " " + a + " " + b);
        }
        else if (c > a && c > b) {
            if (b>a) {
                System.out.println(a + " " + b + " " + c);
            }
            else System.out.println(b + " " + a + " " + c);
        }
    }
}