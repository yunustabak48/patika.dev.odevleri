
//Java ile klavyeden girilen N tane sayma sayısından en büyük ve
// en küçük sayıları bulan ve bu
// sayıları ekrana yazan programı yazın.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int number,n,max=0,min = 0;

        System.out.print("how many numbers will you enter: ");
        number = scn.nextInt();

        for (int i=1;i<=number;i++){
            System.out.println(" please enter "+i+".numbers");
            n=scn.nextInt();
            if(i==1){
                max=n;
                min=n;
            }else {
                if (n< min){
                    min=n;

                } else if (n>max) {
                    max=n;

                }
            }
        }
        System.out.println("The max number is :" + max);
        System.out.println("The min number is :" + min);

    }
}