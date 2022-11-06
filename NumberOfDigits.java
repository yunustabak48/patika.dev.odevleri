//Bir sayının basamak sayılarının toplamını
// hesaplayan program yazınız.

       // Örnek : 1643 = 1 + 6 + 4 + 3 = 14


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k,total=0,numbercounter=0 ;
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number :");
        k=scn.nextInt();

        while(k!=0){
            total += (k % 10);
            k/=10;
           ++numbercounter;
        }
        System.out.println("digit sum = "+total);

        }

    }
