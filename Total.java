//Java döngüler ile tek bir sayı girilene kadar
// kullanıcıdan girişleri kabul eden ve girilen
// değerlerden çift ve 4'ün katları olan sayıları
// toplayıp ekrana basan programı yazıyoruz.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scn = new Scanner(System.in);

        do {
            System.out.print("Enter the number:");
            n=scn.nextInt();

            if(n%2==0 && n%4==0 ){
                total=total+n;
            }

        }while(n%2==0);
        System.out.println("your total is: "+total);

    }
}