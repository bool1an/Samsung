package Unit2.task1;

import java.util.Scanner;

public class Number_1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int come = in.nextInt();
        System.out.println(Integer.toBinaryString(come));
        System.out.println(Integer.toOctalString(come));
        System.out.println(Integer.toHexString(come));
        if (come <= Byte.MAX_VALUE && come >= Byte.MIN_VALUE) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        if (come <= Short.MAX_VALUE && come >= Short.MIN_VALUE) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
