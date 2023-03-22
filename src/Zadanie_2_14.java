import java.util.Scanner;
public class Zadanie_2_14{
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
            double minutyobliczoneB=min-900;
            double cenaB=minutyobliczoneB*0.40;
            double oplatyB=cenaB+59.99;
            double minutyobliczoneC=min-0;
            double cenaC=minutyobliczoneC*1;
            double oplatyC=cenaC+69.99;
            double roznicaB=oplaty-oplatyB;
            double roznicaC=oplatyC-oplaty;
            System.out.println("Kupujac pakiet B zaoszczedzisz : " + roznicaB);
            System.out.println("Kupujac pakiet C zaoszczedzisz : " + roznicaC);
        }
        else if(Litera.equals("B")){
            System.out.println("Wprowadz liczbe minut");
            Scanner mn = new Scanner(System.in);
            min = mn.nextInt();
            double minutyobliczoneB=min-900;
            double cenaB=minutyobliczoneB*0.40;
            double oplatyB=cenaB+59.99;
            double roznicaC=oplatyB-69.99;
            System.out.println("Kupując pakiet C zaoszczedzisz: " + roznicaC);
        }
        else if(Litera.equals("C")){
            System.out.println("Pakiet bez limitów ");
            System.out.println("Opłata wynosi : 69.99");
        }
    }
}