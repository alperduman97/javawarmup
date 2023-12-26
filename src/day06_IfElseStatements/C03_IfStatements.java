package day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfStatements {

    //kullanıcıdan bir sayi isteyip, sayiyi kontrol edip 5 ile bölünebiliyorsa
    //sayi 5'in tam katıdır yazdırın, kati değilse değildir yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int girilenSayi= scanner.nextInt();


        if (girilenSayi % 5 == 0) {
            System.out.println("sayı 5'in tam katıdır!");

        }else {
            System.out.println("sayi 5 in katı değildir");
        }

    }




















}
