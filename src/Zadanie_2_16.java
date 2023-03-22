import java.util.Scanner;
public class Zadania_2_16 {
    public static void main(String[] args) {
        int ksiazka;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz liczbe zakupionych ksiazek");
        ksiazka = dane.nextInt();
        if (ksiazka==0){
            System.out.println("Klient otrzymuje 0 pkt");
        }else  if (ksiazka==1){
            System.out.println("Klient otrzymuje 5 pkt");
        }else  if (ksiazka==2){
            System.out.println("Klient otrzymuje 15 pkt");
        }else  if (ksiazka==3){
            System.out.println("Klient otrzymuje 30 pkt");
        }else  if (ksiazka>=4){
            System.out.println("Klient otrzymuje 60 pkt");
        }
    }
}