import java.util.Scanner;
//Üç kenar uzunluğunu
// kullanıcıdan aldığınız üçgenin alanını
// hesaplayan programı yazınız.


public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluşturalım.
        int a,b,c;
        int u;
        int alan;
        // Kullanıcıdan verileri scanner ile alalım.
        Scanner girdi= new Scanner(System.in);
        System.out.print("a kenarını yazınız:");
        a=girdi.nextInt();
        System.out.print("b kenarını yazınız:");
        b=girdi.nextInt();
        System.out.print("c kenarını yazınız:");
        c=girdi.nextInt();
        u = (a+b+c) / 2;
        alan  = (int) Math.sqrt ( u * (u-a)* (u-b) * (u-c));
        System.out.print("Üçgenin Alan:"+  alan);
    }
}