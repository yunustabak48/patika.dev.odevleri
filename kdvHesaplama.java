import java.util.Scanner;

public class Main {
    /*
   KDV Tutarı Hesaplayan Program
 Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
   (Not : KDV tutarını 18% olarak alın)
   KDV'siz Fiyat = 10;
   KDV'li Fiyat = 11.8;
   KDV tutarı = 1.8;
   Odev
   Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
    */
    public static void main(String[] args) {
        double tutar,kdvliToplamTutar,kdvOrani1=0.18,kdvOrani2=0.08;
        Scanner input = new Scanner (System.in);
        System.out.print("Ücret Tutarını giriniz:");
        tutar=input.nextInt();
        double kdvTutari=tutar<=1000 ? tutar*kdvOrani1 : tutar*kdvOrani2;
        kdvliToplamTutar=tutar+kdvTutari;
        System.out.println("KDV'siz Tutar:"+tutar);
        System.out.println("KDV Tutarı:"+kdvTutari);
        System.out.println("KDV'li Toplam Tutar:"+kdvliToplamTutar);

    }
}