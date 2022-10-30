//Kullanıcı Girişi klasöründe
// 1)Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
// 2)eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
// unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
// 3)şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
// sorun yoksa
// "Şifre oluşturuldu" yazan programı yazınız.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, select, newPassword;

        Scanner scn = new Scanner (System.in);

        System.out.println("Kullanıcı Adınız : ");
        userName=scn.nextLine();

        System.out.println("Şifreniz : ");
        password=scn.nextLine();

        if (userName.equals("yunus") && password.equals("javapatikası")){
            System.out.println("Sisteme Giriş Yaptınız");
        }
        else {
            System.out.println(" Şifreniz Hatalı,Şifrenizi Sıfırlamak ister misiniz? : \"Evet\" ya da \"Hayır\" yazınız.");
        }
        select=scn.nextLine();
        if(select.equals("Hayır")){
            System.out.println("Şifrenizi tekrar giriniz");
            select=scn.nextLine();
        }
        if (select.equals("Evet")){
            System.out.println("Yeni Şifrenizi Giriniz : ");
            newPassword=scn.nextLine();
            if (newPassword.equals("javapatikası")){
                System.out.println("Şifre oluşturulamadı lütfen başka şifre giriniz : ");
                newPassword=scn.nextLine();
            }
            else{
                System.out.println("Yeni Şifre Başarıyla Oluşturuldu");
            }
        }
    }

    }
