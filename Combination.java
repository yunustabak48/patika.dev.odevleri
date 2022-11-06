import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r = 0, total = 1, total1 = 1, total2 = 1, result;


        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n  number: ");
        n = scn.nextInt();
        System.out.print("enter the r number: ");

        r = scn.nextInt();
        if (n >= r) {


            for (int i = 1; i <= n; i++) {
                total = total * i;
            }

            for (int i = 1; i <= r; i++) {
                total1 = total1 * i;
            }
            for (int i = 1; i <= n - r; i++) {
                total2 = total2 * i;
            }
            result = total / (total1 * total2);
            System.out.println(n + " Combination of " + r + " = " + result);


        }else {
            System.out.println("you entered wrong number");
        }

    }
}