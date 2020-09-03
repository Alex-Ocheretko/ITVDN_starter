import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {

        System.out.println("Рахуємо об'єм і плошу циліндра");

        System.out.println("Задайте радіус");
        Scanner scR = new Scanner(System.in);
        int R = scR.nextInt();

        System.out.println("Задайте висоту");
        Scanner sch = new Scanner(System.in);
        int h = sch.nextInt();

        final float Pi = 3.14159f;

        double V = Pi * R * h;
        double S = 2 * Pi * R * (R + h);

        System.out.println("Площа циліндра дорівнює " + S + ", а його об'єм =" + V);
    }



}
