package day06_IfElseStatements;

import java.util.Scanner;

public class C02_IfStatements {

    public static void main(String[] args) {
        //kullanicidan 2 sayi alin
        //ilk sayi 2.den büyükse "büyüksün sayi1" yazdiirn
        //ikinci sayi 0'dan büyükse "büyüksün sayı2" yazdiralım
        //iki sayinin toplami 100'den büyükse "ikiniz de büyüksünüz" yazdirin


            Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz: ");
        double sayi1= scanner.nextDouble();
        double sayi2= scanner.nextDouble();

        if (sayi1 > sayi2){System.out.println("büyüksün sayi1");}
        if (sayi2 > 0){System.out.println("büyüksün sayi2");}
        if (sayi1 + sayi2 >=100){System.out.println("ikiniz de büyüksünüz");}


    }
}
