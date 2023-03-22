import java.util.Scanner;

public class Zadanie_2_4 {
    public static void main(String[] args) {
        int test,test2,test3;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprawodz wynik z testu 1 ");
        test = dane.nextInt();
        System.out.println("Wprawodz wynik z testu 2 ");
        test2 = dane.nextInt();
        System.out.println("Wprawodz wynik z testu 3 ");
        test3 = dane.nextInt();
        int suma=test+test2+test3;
        float srednia=suma/3;

        if(srednia>90){
            System.out.println("Ocena 5");
        }else if(srednia>=80){
            System.out.println("Ocena 4");
        }else if(srednia>=70){
            System.out.println("Ocena 3");
        }else if(srednia>=60){
            System.out.println("Ocena 2");
        }else if(srednia<60){
            System.out.println("Ocena 1");
        }

    }

}