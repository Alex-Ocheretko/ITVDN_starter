import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final float Pi = 3.141592f;
        System.out.println("Введіть радіус");
        Scanner scR = new Scanner(System.in);
        double R = scR.nextDouble();

        double res = Pi * Math.pow(R, 2);

        System.out.println(res);

    }
}
