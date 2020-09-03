package Homework6;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {

        System.out.println("Введіть кількість місць доставки");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int var = 1;
//        for (int i=1; i<=a; i++){
//        var *= i;
//        }
        do {
        var *= a--;
        }
        while (0<a);

        System.out.println("Кількість можливих варіантів маршруту доставки: " + var);

    }
}
