package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //kullanicidan ismini alip
        //büyük harf olarak yazdirin


        Scanner scanner = new Scanner(System.in);


        System.out.println("Lütfen isminizi giriniz: ");
        String girilenIsim = scanner.nextLine();
        System.out.println("Girdiğiniz ismin yeni hali: "+ girilenIsim.toUpperCase());



















    }
}
