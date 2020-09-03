package Work;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {


        System.out.println("Введіть число для перевірки");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        if ((num & (num - 1)) == 0) {

            System.out.println("Число є степенем двійки");

        }else{
                System.out.println("Число не є степенем 2.");
            }

    }
}
