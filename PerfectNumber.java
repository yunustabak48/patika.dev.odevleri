//Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana
// “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana
// yazan programı Java dilinde yazınız.
//
//Mükemmel Sayı Nedir ?
//Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
// toplamı kendisine eşit olan sayıya mükemmel sayı denir.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,total=0 ;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number=scn.nextInt();
        for(int j=1; j<number; j++){
            if(number%j==0){
                total+=j;
            }
        }
        if(total ==number){
            System.out.println("THİS number is Perferct Number");
        }else{
            System.out.println("THİS number is not  Perferct Number");
        }

    }
}