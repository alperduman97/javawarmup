package day07_IfElseStatements;

import java.util.Scanner;

public class C03_NotYazdirma {


    //kullanicidan 100 üzerinden notunu alin,
    //negatif veya 100'den büyük değer girerse "Geçersiz Not"
    //85 ile 100 arasında ise (sınırlar dahil) AA
    //65(dahil)'dan büyük 85'den küçükse BB
    //50(dahil)'den büyük 65'den küçükse CC
    //50'den küçükse DD, Kaldın yazdırın!


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz: ");
        double not=scanner.nextDouble();

        if (not <0 || not >100){
            System.out.println("Lütfen 0-100 arasında bir değer giriniz!");
        } else if (not >=85 && not <100) {
            System.out.println("AA");
        } else if (not >=65 && not<85) {
            System.out.println("BB");
        } else if (not >=50 && not<65) {
            System.out.println("CC");
        } else if (not<50) {
            System.out.println("Kaldın Digga!");
        }


    }


















}
