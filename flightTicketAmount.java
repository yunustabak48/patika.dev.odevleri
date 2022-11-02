//Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
// Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
// Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
// sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

// Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
// yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
// şeklinde bir uyarı verilmelidir.
// Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
// Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
 //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
 //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        //values

        int age,km,triptype;
        double perKm=0.10, perTwoWay=0.20, ageDiscountRate,normalAmount,ageDiscount,
                discountAmount,twoWayDiscount,totalPrice;


        //get data from user


        System.out.print("enter your age : ");
        age = scn.nextInt();

        System.out.print("Enter your distance by km: ");
        km=scn.nextInt();

        System.out.print("enter your triptype 1(oneway) or 2(twoway): ");
        triptype= scn.nextInt();

        //conditions

        if((triptype==1 ||triptype==2)&&(age > 0 && km > 0)){
            if(age < 12 ) ageDiscountRate = 0.50;
            else if (age <=24 ) ageDiscountRate = 0.10;
            else if( age >=65 ) ageDiscountRate = 0.30;
            else ageDiscountRate = 0;

            normalAmount=km*perKm;
            ageDiscount =normalAmount*ageDiscountRate;
            discountAmount =normalAmount-ageDiscount;
            totalPrice = discountAmount;
            if(triptype ==2){
                twoWayDiscount =discountAmount*perTwoWay;
                totalPrice =(discountAmount-twoWayDiscount)*2;
            }
            System.out.println("total price ="+totalPrice +"TL");


        }else System.out.println("You Have Entered Incorrect Data, Please Try Again.");


    }
}