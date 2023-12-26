package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_scanner {
    public static void main(String[] args) {

        // kullanicidan iki sayi alip, ikisinin degerlerini değiştirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz: ");
        int sayi1= scanner.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        int sayi2= scanner.nextInt();

        int empty= 0;
        empty=sayi2;
        sayi2=sayi1;
        sayi1=empty;


        System.out.println("Girilen sayıları değişirdim\n" + " yeni sayılar şöyle: "+
                "sayi 1'i yeni hali:" +" "+ sayi1 + "\n "+ "sayi 2'nin yeni hali: "+ " "+sayi2);



        // kullanicidan iki sayi alip, ikisinin degerlerini değiştirin - 3.bir değişken kullanmadan!



        System.out.println("Lütfen birinci sayiyi giriniz: ");
        int sayi3= scanner.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        int sayi4= scanner.nextInt();

        sayi3= sayi3+sayi4;
        sayi4=sayi3-sayi4;
        sayi3= sayi3-sayi4;
        System.out.println("ilk sayi: "+sayi3+ "ikinci sayi: " + sayi4);







    }
}
