//Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        int due = 3;
        int balance = 1500;
        int num;
        int vSelect = 0;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.print(" enter your user name: ");
            userName = scn.nextLine();

            System.out.print("enter your password:");
            password = scn.nextLine();
            if (userName.equals("yunus tabak") && password.equals("12345")) {
                System.out.println("Welcome to the YunusBank");
                do {


                    System.out.println("Please select the action you want to do");
                    System.out.println("1-deposit process :\n" + "2-withdraw money:\n" +
                            "3-balance inquiry:\n" + "4-Log out:");
                    num = scn.nextInt();
                    switch (num) {
                        case 1:
                            System.out.println("money quantity");
                            int a = scn.nextInt();
                            balance += a;
                            System.out.println("your balance=" + balance);
                            break;
                        case 2:
                            System.out.println("Enter the amount you want to withdraw");
                            int b = scn.nextInt();
                            if (b > balance) {
                                System.out.println("insufficient balance");
                                break;
                            } else {
                                balance -= b;
                                System.out.print("your balance" + balance);
                            }
                            break;
                        case 3:
                            System.out.println("your current balance" + balance);
                            break;
                        case 4:
                            System.out.println("Have a nice day. We are waiting for you again");


                    }


                } while (num != 4) ;

            } else{
                due--;
                System.out.println("You entered an incorrect user or password, try again.");
                if (due == 0) {
                    System.out.println("Your account has been blocked. Contact the bank");
                }
            }
        }while  (due > 0 && vSelect != 1) ;
    }
}

