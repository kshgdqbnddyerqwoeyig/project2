import java.util.Scanner;

public class Zadanie_2_10 {
    public static void main(String[] args) {
        int kalorie;
        int gramy;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj kalroie");
        kalorie = dane.nextInt();
        System.out.println("Podaj gramy");
        gramy = dane.nextInt();
        double kalorieztlu=gramy*9;
        double pro=kalorie*0.3;
        if(kalorieztlu<pro){
            System.out.println("Produkt jest niskotluszczowy");
        }
        else if(kalorieztlu>kalorie){
            System.out.println("Błąd");
        }

    }

}
