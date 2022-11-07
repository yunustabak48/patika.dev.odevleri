
//Java ile iki sayının EBOB ve EKOK değerlerini
// "While Döngüsü" kullanarak yazınız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,ebob=1 ,ekok=1,i=1;
        Scanner scn =new Scanner(System.in);
        System.out.print("enter n1 number: ");
        n1= scn.nextInt();

        System.out.print("enter n2 number: ");
        n2= scn.nextInt();

        while (i<=n1&&i<=n2){
            if(n1%i==0 && n2 % i==0){
                ebob =i;
            }
            i++;

        }
        System.out.println("Ebob =" +ebob);

        while (i<=(n1*n2)){
            if(i % n1 == 0 && i%n2==0){
                ekok=i;
                System.out.println("ekok= "+ekok);
                break;
            }
            i++;
        }


    }
}