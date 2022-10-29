import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma , domates , muz, patlıcan ;
        Scanner inp = new Scanner(System.in);
        System.out.print(" Armut kaç kilo ? :" );
        armut = inp.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        elma= inp.nextDouble();
        System.out.print(" Domates kaç kilo ? :");
        domates = inp.nextDouble();
        System.out.print(" Muz kaç kilo ? :");
        muz = inp.nextDouble();
        System.out.print(" Patlıcan Kaç Kilo ? :");
        patlıcan = inp.nextDouble();

        double toplamTutar=(armut*2.14)+(elma*3.67)+(domates*1.1)+(muz*0.95)+(patlıcan*5);
        System.out.println("Toplam  tutar:" + toplamTutar+"TL" ) ;
    }
}