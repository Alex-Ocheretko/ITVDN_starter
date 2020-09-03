package Homework6;

import java.util.Scanner;

public class GeoPryamook {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте висоту");

        int a = scan.nextInt();
        System.out.println("Задайте ширину");
        int b = scan.nextInt();
        int c = b-2;

        for (int i=1; i<=a; i++){
            System.out.print('*');
           if (i==1 | i==a){
            for (int j=1; j<=c; j++){
                System.out.print('*');
            }
           } else {
               for (int j=1; j<=c; j++) {
                   System.out.print(" ");
               }
           }
            System.out.print('*');
            System.out.print('\n');
        }
    }
}