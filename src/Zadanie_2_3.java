import java.util.Scanner;

public class Zadanie_2_3 {
    public static void main(String[] args) {
        float wzrost, waga;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz wzrost w metrach " );
        wzrost = dane.nextFloat();
        System.out.println("Wprowadz wage");
        waga = dane.nextInt();
        float wzr1=wzrost*wzrost;
        double bmi = waga/wzr1;
        if (bmi > 25) {
            System.out.println("Masz nadwage.");
        } else if (bmi <18.5) {
            System.out.println("Masz niedowage");
        } else {
            System.out.println("W normie");
        }

    }
}