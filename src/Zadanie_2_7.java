import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zadanie_2_7 {
    public static void main(String[] args) {
        String  imie1;
        String  imie2;
        String imie3;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj imie osoby 1");
        imie1 = dane.nextLine();
        System.out.println("Podaj imie osoby 2");
        imie2 = dane.nextLine();
        System.out.println("Podaj imie osoby 3");
        imie3 = dane.nextLine();
        List<String> osoby = new LinkedList<>();
        osoby.add(imie1);
        osoby.add(imie2);
        osoby.add(imie3);
        Collections.sort(osoby);
        for (String patient:osoby
        ) {
            System.out.println(patient);
        }

    }
}