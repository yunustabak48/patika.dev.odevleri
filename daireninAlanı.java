//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire
// diliminin alanı bulan programı yazınız.
//𝜋 sayısını = 3.14 alınız.
//Formül : (𝜋 * (r*r) * 𝛼) / 360


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını yazınız:");
        int r = inp.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü yazınız:");
        int a = inp.nextInt();
        double alan = pi * (double)(r * r) * (double)a / 360.0;
        System.out.println("Dairenin alanı:" + alan);
    }
}