
import  java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        // değişkenleri oluturma
        int mat,fizik,kimya,turkce, tarih,muzik;

        //scanner sınıfımızı tanımladık;
        Scanner scn =new Scanner(System.in);

        //kullanıcıdan  değerleri alma
        System.out.print("matematik notunuz:");
        mat=scn.nextInt();

        System.out.print("fizik notunuz:");
        fizik=scn.nextInt();

        System.out.print("kimya notunuz:");
        kimya=scn.nextInt();

        System.out.print("türkçe notunuz:");
        turkce=scn.nextInt();

        System.out.print("tarih notunuz:");
        tarih=scn.nextInt();

        System.out.print("muzik notunuz:");
        muzik=scn.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc =toplam/6;
        System.out.println("ortalamanız:"+sonuc);









    }
}
