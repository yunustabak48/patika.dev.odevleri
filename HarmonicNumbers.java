
//Java ile girilen sayının harmonik serisini bulan program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter the N number : ");
        int n =scn.nextInt();
        double result =0 ;
        for(int i =1;i<=n; i++){
            result+=(1.0/i);
        }
        System.out.println(result);

    }
}