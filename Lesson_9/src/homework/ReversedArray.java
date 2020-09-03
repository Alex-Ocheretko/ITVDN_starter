package homework;

import java.util.Scanner;

public class ReversedArray {
     static int [] myReverse(int [] array){
         int [] arrMyDudes = new int[array.length];
        for (int j =array.length-1, i = 0; j >= 0; j--, i++) {
            arrMyDudes[i] = array[j];
        }
        return arrMyDudes;
     }
     static int [] subArray(int [] array, int index, int count){
         int [] arr = new int [count];
         for (int i = index, j = 0; i <= count + index -1 ; i++, j++) {
             arr[j] = array[i];
         }
         return arr;
     }
    public static void main(String[] args) {
        System.out.println("Задайте розмір масиву: ");
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        System.out.println("З якого елемету почати вибірку?");
        int index = scn.nextInt();
        System.out.println("Скільки елементів додати у вибірку?");
        int count = scn.nextInt();
        int[] arr = new int[N];
        System.out.println("Початково задане значення масиву");
        for (int i = 0; i <= N - 1; i++) {
            arr[i] = i;
            System.out.print(arr[i]+" ");
        }
        int [] arr0 = ReversedArray.myReverse(arr);

        int [] arr1 = ReversedArray.subArray(arr, index,count);
        System.out.println();
        System.out.println("Інветрований масив 1");

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr0[i]+" ");
        }
        System.out.println();
        System.out.println("Вибірка: ");
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}