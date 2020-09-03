package homework;

import java.util.Scanner;

public class UserArray {
    static int[] addElement (int [] array, int value){
        int D = array.length + 1;
        int [] array2 = new int[D];
        int [] arrayRetorn = new int[D];

        for (int i = 0, j = array.length - 1; i < array2.length; i++, j--) {
            if (i < array.length){
                array2[i] = array[j];
            } else {
                array2[i] = value;
            }
        }

        for (int k = 0, l = array2.length - 1; k <= array2.length - 1; k++, l--) {
            arrayRetorn[k] = array2[l];
        }
        return arrayRetorn;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Задайте кількість елементів масиву");
        int N = scn.nextInt();
        int [] array = new int[N];
        System.out.println("Задайте число, яке додати в нульовий індекс масиву: ");
        int value = scn.nextInt();
        for (int i = 0; i <= N - 1; i++) {
            array[i] = i * 2;
        }
        array = addElement(array, value);

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
