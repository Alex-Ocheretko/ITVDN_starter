package homework8;

import java.util.Scanner;

public class Bank {

    static void kredit () {

        int kred = 700;
        int zarah = 0;

        while (zarah < kred) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            zarah += a;

            if (zarah < kred) {
                System.out.println("Величина кредиту: " + kred + " Внесено: " + zarah + " Залишилось внести: " + (kred - zarah));
            } else {
                System.out.println("Заборгованість погашено");
            }
        }
    }

    public static void main(String[] args) {
        Bank.kredit();
    }
}
