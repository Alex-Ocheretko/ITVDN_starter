package Lesson4;

import java.util.Scanner;

public class DopWork {
    public static void main(String[] args) {
        System.out.println("Введіть слово для перекладу");

        Scanner sc = new Scanner(System.in);
        String slovo = sc.next();

        switch (slovo) {
            default:{
                System.out.println("Слово не знайоме");
                break;
            }
            case "дощ": {
                System.out.println("rain");
                break;
            } case "сонце": {
                System.out.println("sun");
                break;
            } case "сніг": {
                System.out.println("snow");
                break;
            }
            case "вітер": {
                System.out.println("wind");
                break;
            }
            case "град": {
                System.out.println("hail");
                break;
            }
            case "тепло": {
                System.out.println("warm");
                break;
            }
            case "гроза": {
                System.out.println("thunderstorm");
                break;
            }
            case "холод": {
                System.out.println("cold");
                break;
            }
            case "хмарно": {
                System.out.println("Cloudy");
                break;
            }
            case "завірюха": {
                System.out.println("blizzard");
                break;
            }

        }
    }
}