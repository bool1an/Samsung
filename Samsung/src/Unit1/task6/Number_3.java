package Unit1.task6;

import java.util.Scanner;

public class Number_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt ();

        if (a%100 > 4 && a%100 < 21)
            System.out.println(a + " " + "TOPTOB");
        else {
            switch (a%10){
                case 0:
                    System.out.println(a + " TOPTOB");
                    break;
                case 1:
                    System.out.println(a + " TOPT");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(a + " TOPTA");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(a + " TOPTOB");
                    break;

            }
        }
    }
}