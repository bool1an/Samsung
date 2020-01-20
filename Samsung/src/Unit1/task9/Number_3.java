package Unit1.task9;

import java.util.Scanner;

public class Number_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int get = in.nextInt();
        int n = 0;
        for (int i = 100; i < get ; i++) {
            int c = i % 10;
            int b = i / 100;
            int a = (i % 100) / 10;
            int d = a + b + c;
            if (d % 13 == 0) {
                n++;
            }
        }
        System.out.println(n);
    }
}
