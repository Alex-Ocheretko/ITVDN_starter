package Lesson4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Ведіть першу(е) число/цифру.");
        Scanner sc1 = new Scanner(System.in);
        int operand1 = sc1.nextInt();

        System.out.println("Ведіть другу(е) число/цифру.");
        Scanner sc2 = new Scanner(System.in);
        int operand2 = sc2.nextInt();

        System.out.println("Задайте арифметичну операцію");
        Scanner sc3 = new Scanner(System.in);
        String sign = sc3.next();
        switch (sign) {

            default: {
                System.out.println("Не коректна операція");
                break;
            }
            case "/": {
                System.out.println("Результат = " + (operand1 / operand2));
                break;
            }
            case "*": {
                System.out.println("Результат = " + (operand1 * operand2));
                break;
            }
            case "-": {
                System.out.println("Результат = " + (operand1 - operand2));
                break;
            }
            case "+": {
                System.out.println("Результат = " + (operand1 + operand2));
                break;
            }
        }

    }

}
