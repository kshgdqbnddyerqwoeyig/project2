package Decyzje;


import java.util.Scanner;

public class Zadanie_2_11 {
    public static void main(String[] args) {
        String nazwisko1;
        String nazwisko2;
        String nazwisko3;
        int czas1,czas2,czas3;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj nazwisko osoby 1");
        nazwisko1 = dane.nextLine();
        System.out.println("Podaj czas dobiegniecia do mety w min");
        czas1 = dane.nextInt();
        System.out.println("Podaj nazwisko osoby 1");
        nazwisko2 = dane.nextLine();
        System.out.println("Podaj czas dobiegniecia do mety w min");
        czas2 = dane.nextInt();
        System.out.println("Podaj nazwisko osoby 1");
        nazwisko3 = dane.nextLine();
        System.out.println("Podaj czas dobiegniecia do mety w min");
        czas3 = dane.nextInt();

    }
}