package day06_IfElseStatements;

import java.util.Scanner;

public class C01_IfStatements {

    public static void main(String[] args) {


        //kullanicidan 2 değer alin,
        // 1. sayi 2.sayidan büyükse aferin yazdirin
        //1.sayi çift ise, çift sayıları severim yazdırın
        //2.sayı 50'den büyük ise, büyük sayılarla işim olmaz yazdırın
        // toplamları 100'den küçük ise, ufak sayılarla işim olmaz yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki tam sayı Giriniz:");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();


        if (sayi1 > sayi2){
            System.out.println("Aferin");

        }  if (sayi1 % 2 == 0) {
            System.out.println("çift sayıları severim");
        } if (sayi2 > 50) {
            System.out.println("büyük sayılarla işim olmaz");
        } if ((sayi1 + sayi2 == 100 || sayi1+sayi2<100)) {
            System.out.println("ufak sayılarla işim olmaz");
        }else  {
            System.out.println("lÜTFEN 0-100 arasında bir değer girin!");
        }


    }
}
