package Unit1.task9;

import java.util.Scanner;

public class Number_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kolvo = 0;
        for (int i = 14; i < 100; i += 7) {
            int a = 0;
            int c = 0;
            a = i % 10;
            c = i / 10;
            kolvo += a + c;
        }
        System.out.println(kolvo);
    }
}
