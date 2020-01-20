package Unit1.task9;

import java.util.Scanner;



public class Number_1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int get = in.nextInt();
    int do1 = get % 10;
    int do2 = get / 10;
    System.out.println(do1 + do2);
    }
}
