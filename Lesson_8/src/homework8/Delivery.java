package homework8;

import java.util.Scanner;

public class Delivery {
    static int factorial (int a) {
        if (a == 0){
            return 1;
        } else {
           int fac = a * factorial( a - 1);
            return fac;
        }
    }
    public static void main(String[] args) {
        System.out.println("Введіть кількість місць доставки");
        Scanner a = new Scanner(System.in);
        int N = a.nextInt();

        System.out.print("Шляхів доставки: " + factorial(N));
    }
}
