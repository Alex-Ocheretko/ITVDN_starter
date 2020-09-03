package homework7;

import java.util.Scanner;

public class Calculator {

    static int serAref(int a, int b, int c) {
        int res = (a + b + c)/3;
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть А");
        int a = sc.nextInt();
        System.out.println("Введіть В");
        int b = sc.nextInt();
        System.out.println("Введіть С");
        int c = sc.nextInt();

        System.out.print("Середнє арифметичне = " + serAref(a,b,c));

    }
}
