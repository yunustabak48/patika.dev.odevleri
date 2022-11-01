
//Girilen 3 sayıyı "küçükten büyüğe"
// sıralayan programı yazınız.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,row;

        Scanner scn =new Scanner(System.in);


        System.out.print("1.sayıyı giriniz");
        a=scn.nextInt();
        System.out.print("2.sayıyı giriniz");
        b=scn.nextInt();
        System.out.print("3.sayıyı giriniz");
        c=scn.nextInt();

        if (a>b){
            row = a;
            a = b;
            b = row;
        }
        if (a>c){
            row = a;
            a = c;
            c = row;
        }
        if (b>c){
            row = b;
            b = c;
            c = row;
        }

        System.out.println(a + " < " + b + " < " + c );







    }
}