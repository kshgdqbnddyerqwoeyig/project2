import java.util.Scanner;
public class Zadanie_2_15{
    public static void main(String[] args) {
        int czek;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz liczbe czekow");
        czek = dane.nextInt();
        if (czek<20){
            double kwota=czek*0.1+10;
            System.out.println("Kwota w tym miesiacu za czeki wyniosła :" + kwota );
        }else if (czek<39){
            double kwota=czek*0.08+10;
            System.out.println("Kwota w tym miesiacu za czeki wyniosła :" + kwota );
        }else if (czek<59){
            double kwota=czek*0.06+10;
            System.out.println("Kwota w tym miesiacu za czeki wyniosła :" + kwota );
        }else if (czek>60){
            double kwota=czek*0.04+10;
            System.out.println("Kwota w tym miesiacu za czeki wyniosła :" + kwota );
        }
    }
}