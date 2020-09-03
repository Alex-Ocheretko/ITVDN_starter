package Lesson4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Введіть значення");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (0 <= a && a <= 14) {
            System.out.println("Введене значення знаходться в діапазоні 0-14");
        } else if (15 <= a && a<=35){
            System.out.println("Введене значення знаходться в діапазоні 15-35");
        } else if (36 <= a && a <= 50) {
            System.out.println("Введене значення знаходться в діапазоні 36-50");
        } else if (51 <= a && a <= 100) {
            System.out.println("Введене значення знаходться в діапазоні 51-100");
        } else {
            System.out.println("Введене значення не в діапазоні [0-100]");
        }
    }
}