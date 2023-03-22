import java.util.Scanner;
public class Zadanie_2_9 {
    public static void main(String[] args) {
        int waga;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj kilogramy");
        waga = dane.nextInt();
        if(waga<=1){
            double cena=waga*1.1;
            System.out.println("Cena wynosi : " + cena);
        }
        else if(waga<=3){
            double cena=waga*2.2;
            System.out.println("Cena wynosi : " + cena);
        }
        else if(waga<=5){
            double cena=waga*3.7;
            System.out.println("Cena wynosi : " + cena);
        }
        else if(waga>5){
            double cena=waga*3.8;
            System.out.println("Cena wynosi : " + cena);
        }
    }
}