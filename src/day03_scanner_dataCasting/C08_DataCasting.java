package day03_scanner_dataCasting;

import java.util.Scanner;

public class C08_DataCasting {

    //kullanicidan 2 tam sayi alip, 1.sayiyi 2.sayiya bölün
    //sonucu ondalıklı olarak yazdırın

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz: "); //40
        double sayi1= scanner.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz: "); //7
        int sayi2= scanner.nextInt();
        double islem= sayi1/sayi2;
        System.out.println(islem); // 5.714285714285714

        //sayilardan birini double yapinca ondalıklı değer alabildik. İki sayi'da int olunca ondalıklı vermiyor







    }


}
