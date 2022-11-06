//Java ile kullanıcının girdiği değerler ile üslü sayı
// hesaplayan programı "For Döngüsü" kullanarak yapınız.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int k,n,total=1;
        Scanner scn = new Scanner(System.in);
        System.out.print("number to be exponentiated: ");
        k=scn.nextInt();
        System.out.print("the number to be the exponent: ");
        n=scn.nextInt();

        for(int i =1 ; i<=n ;i ++){
            total *=k;


        }
        System.out.println("result :" +total);
    }
}