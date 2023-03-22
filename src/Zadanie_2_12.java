import java.util.Scanner;
public class Zadanie_2_12 {
    public static void main(String[] args) {
        String slowo;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj slowo powietrze, woda lub stal");
        slowo = dane.nextLine();
        float odleglosc;
        System.out.println("Podaj odleglosc");
        odleglosc = dane.nextFloat();
        if(slowo.equals("powietrze")){
            double czas=odleglosc/343;
            System.out.println("Czas wynosi : " + czas);
        }
        else if(slowo.equals("woda")){
            double czas=odleglosc/1490;
            System.out.println("Czas wynosi : " + czas);
        }
        else if(slowo.equals("stal")){
            double czas=odleglosc/5100;
            System.out.println("Czas wynosi : " + czas);
        }
    }
}
