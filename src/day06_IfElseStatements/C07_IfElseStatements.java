package day06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        //kullanicidan 2 tam sayi alin;
        //eğer sayi1  sayi2'den büyükse sayi1'i 1 azaltıp, sayi2'yi 1 arttirin
        //sayi1 sayi2'den büyük değilse, sayi1'i 3 ile çarpıp ve sayi2'yi 2 ile çarpın
        //sayi1 ve sayi2'nin son değerlerini yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 2 tam sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        if (sayi1 > sayi2) {
            System.out.println("sayi1: " + --sayi1 + "\n"+"sayi2: " + ++sayi2);
        } else {
            System.out.println("sayi1 son değeri: "+ sayi1*3 + "\n"+ "sayi2 son değeri: "+sayi2*2 );

        }
    }
}