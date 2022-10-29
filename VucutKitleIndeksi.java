import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenlerin tanımlanması
        double boy,kilo,Endex;
        Scanner scn = new Scanner(System.in);
        System.out.print("kg cinsinden kilonuzu giriniz:");
        kilo=scn.nextDouble();
        System.out.print("cm cinsinden boyunuzu giriniz:");
        boy=scn.nextDouble();
        Endex =kilo/(boy*boy);
        System.out.println("boy kilo endeksiniz:"+Endex);



    }
}