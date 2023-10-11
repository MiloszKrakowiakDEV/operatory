package pl.gornik;

import java.util.Scanner;

public class Main {
    public final static double LICZBA_PI = 3.14;
    public static void main(String[] args) {
        double radius = 4.25;
        double areaCircle = LICZBA_PI * radius * radius;
        System.out.println(areaCircle);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj  a:");
//        int a = scanner.nextInt();
//        int b = 1;
//        a += b;
        int i = 5;
//        System.out.printf("Twoje liczba zwiększona o 1 to %d \n",a);
        System.out.println(i++);
        System.out.println(--i);
        System.out.println("Podaj liczbę:");
        int number1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int number2 = scanner.nextInt();
        if(number1 % 3 == 0 && number2 % 3 == 0 || number1 + number2 > 10){
            System.out.printf("Liczby %d %d są podzielne lub ich suma(%d) jest większa od 10", number1, number2, number1 + number2);
        }
        else{
            System.out.printf("Liczby %d oraz %d nie są podzielne przez 3 oraz ich suma(%d) nie jest większa od 10.", number1, number2, number1 + number2);
        }

    }
}
//ciekawe