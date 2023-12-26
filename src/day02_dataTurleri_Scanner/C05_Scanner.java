package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {

    //kullanicidan bir double ve bir de int sayi alip bunlarin toplamini ve carpimini yazdirin


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ondalıklı bir sayi giriniz: ");
        double girilenSayi= scanner.nextDouble();
        System.out.println("Lütfen bir tam sayi giriniz: ");
        int girilenSayi1=scanner.nextInt();
        System.out.println("girilen sayilar: "+girilenSayi+ " - " +girilenSayi1+"\n"
        +"girilen sayiların toplamı : " + (girilenSayi1+girilenSayi)+  "-"+ "girilen sayıların çarpımı: "+(girilenSayi*girilenSayi1));

    }


}
