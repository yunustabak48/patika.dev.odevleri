//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
// kuvvetlerini ekrana yazdıran programı yazıyoruz.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number : ");
        k = scn.nextInt();
        System.out.println("powers of 4*");

        for (int i = 1; i <= k; i *= 4) {
            System.out.println(i);

        }
        System.out.println("powers of 5*");
        for (int i = 1; i <= k; i *= 5) {
            System.out.println(i);

        }
    }
}