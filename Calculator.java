//Videodaki hesap makinesini
// switch-case kullanarak yapınız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;


        Scanner scn = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        n1 = scn.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = scn.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("seçiminiz: ");
        select = scn.nextInt();

        switch (select) {
            case 1:
                System.out.println("toplam :" + (n1 + n2));
                break;
            case 2:
                System.out.println("çıkarma :" + (n1 - n2));
                break;
            case 3:
                System.out.println("çarpma :" + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("0 a bölünemez");
                }
                break;
            default:
                System.out.println("yanlış seçim yaptınız");

        }


    }
}