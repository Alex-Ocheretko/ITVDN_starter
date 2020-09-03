package Work;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {

        System.out.println("Введіть число для перевірки");
        Scanner scan = new Scanner(System.in);
        int chislo = scan.nextInt();

        if ((chislo & 1) == 1) {
            System.out.println("Не парне.");
        } else {
            System.out.println("Парне.");
        }
    }
}
