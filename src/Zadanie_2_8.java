import java.util.Scanner;

public class Zadanie_2_8 {
    public static void main(String[] args) {
        int program;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj ilosc zakupionego oprogramowania");
        program = dane.nextInt();
        if(program>10){
            double cena1= 99*program*0.2;
            double cena2= 99*program;
            double cena3= cena2-cena1;
            System.out.println("Cena wynosi: " + cena3);
        } else if (program<19) {
            double cena1= 99*program*0.2;
            double cena2= 99*program;
            double cena3= cena2-cena1;
            System.out.println("Cena wynosi: " + cena3);
        } else if (program>20) {
            double cena1= 99*program*0.3;
            double cena2= 99*program;
            double cena3= cena2-cena1;
            System.out.println("Cena wynosi: " + cena3);
        } else if (program<49) {
            double cena1= 99*program*0.3;
            double cena2= 99*program;
            double cena3= cena2-cena1;
            System.out.println("Cena wynosi: " + cena3);
        } else if (program>59) {
            double cena1= 99*program*0.4;
            double cena2= 99*program;
            double cena3= cena2-cena1;
            System.out.println("Cena wynosi: " + cena3);
        } else if (program<99) {
            double cena1= 99*program*0.4;
            double cena2= 99*program;
            double cena3= cena2-cena1;
            System.out.println("Cena wynosi: " + cena3);
        } else if (program>100) {
            double cena1= 99*program*0.5;
            double cena2= 99*program;
            double cena3= cena2-cena1;
            System.out.println("Cena wynosi: " + cena3);
        }

    }
}