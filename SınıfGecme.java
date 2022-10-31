import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

// girilen değerler 0-100 arasında mı

        int i = 0, top = 0;
        if (mat<=100 && mat>=0) {
            i++;
            top = top + mat;
        }

        if (turkce<=100 && turkce>=0) {
            i = i + 1;
            top = top + turkce;
        }

        if (fizik<=100 && fizik>=0) {
            i = i +1;
            top = top + fizik;
        }

        if (kimya<=100 && kimya>=0) {
            i = i + 1;
            top = top + kimya;
        }

        if (muzik<=100 && muzik>=0) {
            i = i + 1;
            top = top + muzik;
        }
        if (tarih<=100 && tarih>=0) {
            i = i + 1;
            top = top + tarih;
        }


        double ort;
        ort = (top/i);
        if(ort <=55){
            System.out.println("sınıfta kaldınız seneye tekrar aynı sınıfıtasınız.");

        }else{
            System.out.println("tebrik sınıfı geçtiniz");

        }
          System.out.println("ortalamanız:"+ort);
    }
}