package homework8;

import java.util.Scanner;

public class Calculator {

    static float del (float d) {
        return d / 5;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float c = scn.nextFloat();

        System.out.println(del(a) +" "+ del(b) +" "+ del(c));
    }
}
