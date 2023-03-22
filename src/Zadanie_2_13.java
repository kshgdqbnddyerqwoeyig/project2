import java.util.Scanner;
public class Zadanie_2_13{
    public static void main(String[] args) {
        String Litera;
        Scanner dane = new Scanner(System.in);
        System.out.println("Pakiet A: Cena 39.99 mies 450min darmowych kazda nastepna  0,45");
        System.out.println("Pakiet B: Cena 59.99 mies 900min darmowych kazda nastepna  0,40");
        System.out.println("Pakiet C: Cena 69.99 mies brak limitu");
        System.out.println("Wybierz Pakiet wpisz litere przy nazwie pakietu");
        Litera = dane.nextLine();
        int min;
        if(Litera.equals("A")){
            System.out.println("Wprowadz liczbe minut");
            Scanner mn = new Scanner(System.in);
            min = mn.nextInt();
            double minutyobliczone=min-450;
            double cena=minutyobliczone*0.45;
            double oplaty=cena+39.99;
            System.out.println("Łączne opłaty wynoszą : " + oplaty);
        }
        else if(Litera.equals("B")){
            System.out.println("Wprowadz liczbe minut");
            Scanner mn = new Scanner(System.in);
            min = mn.nextInt();
            double minutyobliczone=min-900;
            double cena=minutyobliczone*0.40;
            double oplaty=cena+59.99;
            System.out.println("Łączne opłaty wynoszą : " + oplaty);
        }
        else if(Litera.equals("C")){
            System.out.println("Pakiet bez limitów ");
            System.out.println("Opłata wynosi : 69.99");
        }
    }
}