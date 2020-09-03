package homework7;

import java.util.Scanner;

public class Arithmetics {

    static int add(int a, int b) {
        int res = a + b;
        return res;
    }
    static int sub(int a, int b){
        int res = a - b;
        return res;
    }
    static int mul(int a, int b){
        int res = a * b;
        return res;
    }
    static int div(int a, int b){
        if (b != 0) {
            int res = a / b;
            return res;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner ina = new Scanner(System.in);
        System.out.println("Введіть а");
        int a = ina.nextInt();
        System.out.println("Введіть в");
        int b = ina.nextInt();
        System.out.println("Введіть дію");
        String diya = ina.next();

        switch (diya) {

            case ("+"):
                System.out.println("Сума = " + add(a,b));
                break;
            case ("-"):
                System.out.println("Різниця = " + sub(a,b));
                break;
            case ("*"):
                System.out.println("Множення = " + mul(a,b));
                break;
            case ("/"):
                System.out.println("Ділення = " + div(a,b));
                break;
        }
    }
}