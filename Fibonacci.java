import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number of elements of the Fibonacci series: ");
        int n =scn.nextInt();
        int counter =0;
        int i=0,l=1;
        int total =0;
        System.out.println(n+"elements Fibonacci Series: ");
        while(counter <=n){
            total=i+l;
            System.out.print(i+" ");
            i=l;
            l=total ;
            counter++;
        }


    }
}