import java.util.Scanner;

class ArithmeticAverage {

    public static void main(String[] args) {

        System.out.println("Введіть а");
        Scanner scA = new Scanner(System.in);
        float a = scA.nextInt();
        System.out.println("Введіть b");
        Scanner scB = new Scanner(System.in);
        float b = scB.nextInt();
        System.out.println("Введіть c");
        Scanner scC = new Scanner(System.in);
        float c = scC.nextInt();

        float res = (a + b + c) / 3;

        System.out.println(res);
    }

}
