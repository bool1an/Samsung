package Unit1.task7;

import java.util.Scanner;

public class Number_1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int count = 1;
        while (x >= 0) {
            x = in.nextInt();
            count++;
        }
        System.out.println(count);
    }
}
