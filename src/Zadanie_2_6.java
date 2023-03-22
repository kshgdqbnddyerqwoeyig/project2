import java.util.Scanner;

public class Zadanie_2_6 {
    public static void main(String[] args) {
        float sekundy;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz sekundy ");
        sekundy = dane.nextFloat();

        if(sekundy<3600){
            float minuta=sekundy/60;
            System.out.println("ilośc minut " + minuta);
        } else if (sekundy<86400) {
            float godzina=sekundy/3600;
            System.out.println("ilośc godzin " + godzina);
        }else {
            float dni=sekundy/86400;
            System.out.println("ilośc dni " + dni);
        }
    }
}