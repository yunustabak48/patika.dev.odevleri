//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
// 3 ve 4'e tam bölünen sayıların
// ortalamasını hesaplayan programı yazınız.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k ,total=0,counter=0;
        double average;
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the number : ");
        k =scn.nextInt();

        for(int i =0;i<=k;i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                total=total+i;
                counter++;

            }

        }
        average =total/(counter);
        System.out.println("this is  your average : " + average);

    }
}