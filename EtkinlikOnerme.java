/*Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if
        koşulları başka hangi şekilde oluşturulabilirdi
        farklı çözüm yolları bulunuz.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;

        Scanner scn = new Scanner(System.in);
        System.out.print("Sıcaklık derecesini giriniz:");
        temp = scn.nextInt();
        if (temp < 5) {
            System.out.println("kayak yapabilirsiniz. ");
        } else if (temp >= 5 && temp < 15) {
            System.out.println("sinemaya gidebilrisiniz. ");

        } else if (temp >= 15 && temp <= 25) {
            System.out.println("pikniğe gidebilrisiniz. ");
        } else if (temp > 25) {
            System.out.println("yüzmeye gidebilrisiniz ");
        }
    }
}