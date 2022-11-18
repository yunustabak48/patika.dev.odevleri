//Java ile basamak sayısının kullanıcıdan alınan ve
      //  döngüler kullanılarak, yıldızlar(*) ile ekrana
        //ters üçgen çizen programı yazın.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner scn =new Scanner(System.in);
        System.out.print("enter the number of digits:");
        n=scn.nextInt();
        for(int i=0;i<n;i++){
            for (int j =0;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=2*n-1;k>=(2*i+1);k--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}