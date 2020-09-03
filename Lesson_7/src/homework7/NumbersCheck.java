package homework7;

import java.util.Scanner;

public class NumbersCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число для перевірки");
        int nbr = sc.nextInt();

        NumbersCheck.checkerZnak(nbr);
        NumbersCheck.checkerProst(nbr);
        NumbersCheck.checkerDillen(nbr);
    }

    public static void checkerZnak (int a) {
        if (a >= 0) {
            System.out.println("Число зі знаком +");
        } else {
            System.out.println("Число зі знаком -");
        }
    }

    public static void checkerProst (int a){
        for (int i = 2; i <= a; i++) {
            int res = a % i;
            if (res == 0 && i != a) {
                System.out.println("Число не просте");
                return;
            }
        }
        System.out.println("Число просте");
    }

    public static void checkerDillen (int a) {
        if ((a % 2 == 0) || (a % 5 == 0) || (a % 3 == 0) || (a % 6 == 0) || (a % 9 == 0)) {
            System.out.println("Ділиться націло");
        } else {
            System.out.println("Число не ділиться націло");
        }
    }
}
