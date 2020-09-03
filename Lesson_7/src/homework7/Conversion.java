package homework7;

import java.util.Scanner;

public class Conversion {
    static float convert(float a, float b) {
        float res = a * b;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте баланс для конвертації");
        float bal = sc.nextFloat();
        System.out.println("Задайте курс обміну");
        float kurs = sc.nextFloat();

        System.out.println("Результат = " + convert(bal, kurs));
    }
}
