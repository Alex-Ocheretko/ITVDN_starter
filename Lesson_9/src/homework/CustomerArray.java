package homework;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        System.out.print("Задайте величину масиву: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0, min = 0, sum = 0;
        int[] arr = new int[N];

        for (int i = 0; i < N - 1; i++) {
            int znak = i % 2;
            if (znak == 0) {
                arr[i] = N * i + 1;
            } else {
                arr[i] = N * (-i);
            }
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] > max){
             max = arr[i];
            }
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }

        System.out.println("Непарні значення масиву: ");

        for (int i = 0; i < N; i++) {
            int nepar = arr[i] % 2;
            if (nepar != 0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Максимальне значення: " + max + " Мінімальне значення: " +min+ " Сума всіх елементів: " +sum+ " Середнє арифметичне всіх елементів: " +(sum/N));
    }
}
