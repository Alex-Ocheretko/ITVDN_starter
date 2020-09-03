package Work;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {

        System.out.println("Скільки років працює?");
        Scanner scRoki = new Scanner(System.in);
        short roki = scRoki.nextShort();

        System.out.println("Скільки зп отримує?");
        Scanner scZp = new Scanner(System.in);
        int zp = scZp.nextInt();

        if (0< roki && roki < 5){
            System.out.println("ЗП =" + ( zp + (zp * 0.1)));
        }
        if (5 <= roki && roki < 10){
            System.out.println("ЗП =" + (zp + (zp * 0.15)));
        }
        if (10 <= roki && roki < 15){
            System.out.println("ЗП =" + (zp + (zp * 0.25)));
        }
        if (15 <= roki && roki < 20){
            System.out.println("ЗП =" + (zp + (zp * 0.35)));
        }
        if (20 <= roki && roki < 25){
            System.out.println("ЗП =" + (zp + (zp * 0.45)));
        }
        if (25 <= roki){
            System.out.println("ЗП =" + (zp + (zp * 0.5)));
        }
    }
}
