
/*Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
Ödev:
Aynı örneği switch-case kullanmadan yapınız.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month ,day;
        Scanner scn =new Scanner(System.in);
        System.out.print("doğdunuz ayı giriniz : ");
        month=scn.nextInt();

        System.out.print("doğdunuz günü giriniz : ");
        day =scn.nextInt();

        if ((month == 1) && (day <= 31)) {
            if (day <= 21) {
                System.out.println("oğlak");
            } else {
                System.out.println("kova");
            }
        }
        if ((month == 2) && (day <= 28)) {
            if (day<= 19) {
                System.out.println("kova");
            } else {
                System.out.println("balık");
            }
        }
        if ((month == 3) && (day <= 31)) {
            if (day <= 20) {
                System.out.println("balık");
            } else {
                System.out.println("koç");
            }
        }
        if ((month == 4) && (day <= 30)) {
            if (day <=20) {
                System.out.println("koç");
            } else {
                System.out.println("boğa");
            }
        }
        if ((month == 5) && (day <= 31)) {
            if (day <22) {
                System.out.println("boğa");
            } else {
                System.out.println("ikizler");
            }
        }
        if ((month == 6) && (day <= 30)) {
            if (day <= 22) {
                System.out.println("ikizzler");
            } else {
                System.out.println("yengeç");
            }
        }
        if ((month == 7) && (day <= 31)) {
            if (day <=22) {
                System.out.println("yengeç");
            } else {
                System.out.println("aslan");
            }
        }
        if ((month == 8) && (day <= 31)) {
            if (day <= 22) {
                System.out.println("aslan");
            } else {
                System.out.println("başak");
            }
        }
        if ((month == 9) && (day <= 30)) {
            if (day <= 22) {
                System.out.println("başak");
            } else {
                System.out.println("terazi");
            }
        }
        if ((month == 10) && (day <= 31)) {
            if (day <= 22) {
                System.out.println("terazi");
            } else {
                System.out.println("akrep");
            }
        }
        if ((month == 11) && (day <= 30)) {
            if (day <= 22) {
                System.out.println("akrep");
            } else {
                System.out.println("yay");
            }
        }
        if ((month == 12) && (day <= 31)) {
            if (day <=22) {
                System.out.println("yay");
            } else {
                System.out.println("oğlak");
            }
        }

    }
}