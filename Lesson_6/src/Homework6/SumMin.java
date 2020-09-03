package Homework6;

import java.util.Scanner;

public class SumMin {

    public static void main(String[] args) {

        int sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("А>B введіть А ");
        int A = in.nextInt();
        System.out.println("А>B введіть B ");
        int B = in.nextInt();
        int a = A;
        System.out.print("Непарні цифри між А і В: ");
        for (int i = B; i <= a; i++) {

            int C = i % 2;

            if ( C != 0 ) {

                System.out.print(i + " ");
            }
            sum += A--;

        }
        System.out.println();
        System.out.print("Сума всіх чисел між А і В = " + sum + ".");

    }
}
