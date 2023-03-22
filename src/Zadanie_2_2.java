import java.util.Scanner;

public class Zadanie_2_2 {
    public static void main(String[] args) {
        int dzien,miesiac,rok;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz dzien");
        dzien = dane.nextInt();
        System.out.println("Wprowadz miesiac");
        miesiac = dane.nextInt();
        System.out.println("Wprowadz 2 ostatnie cyfry roku");
        rok = dane.nextInt();
        int inm=dzien*miesiac;
        if(inm==rok){
            System.out.println("Data jest magiczna");
        }
        else {
            System.out.println("Nie jest magiczna");
        }
    }
}