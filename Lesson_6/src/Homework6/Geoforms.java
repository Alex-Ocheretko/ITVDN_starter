package Homework6;

public class Geoforms {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Квадрат");

        for(int i = 1; i<=5; i++) {
            System.out.print("*");
            for (int j = 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        System.out.println("Прямокутний трикутник");


        for (int i=0; i<=5; i++) {
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        System.out.println("рівносторонній трикутник");

        for (int i=0; i<=4; i++){

            for (int j=5; j>=i; --j) {
                System.out.print(" ");
            }
            for (int j=0; j<=i*2; ++j){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        System.out.println("ромб");


        for (int i=0; i<=4; i++) {

            for (int j = 5; j >= i; --j) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i=0; i<=5; i++) {

            for (int j = 0; j <= i+1; ++j) {
                System.out.print(" ");
            }
            for (int j = 8; j >= i * 2; --j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
