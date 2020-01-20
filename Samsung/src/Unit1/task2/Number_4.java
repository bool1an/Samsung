package Unit1.task2;

import java.util.Scanner;

public class Number_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        int c =in.nextInt();
        int e =b*c;
        int z =e%100;
        int v=e/100;
        int d =(a*c)+v;
        System.out.print(d);
        System.out.print(" ");
        System.out.print(z);
    }
}