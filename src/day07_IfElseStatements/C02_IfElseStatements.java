package day07_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {


        //kullanicidan bir harf isteyin,
        //girilen karakter kucuk harf ise, onu büyük harf olarak yazdirin
        //yoksa girilen karakteri girildiği gibi yazdirin



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf girin: ");
        char chr = scanner.next().charAt(0);
        if (Character.isLowerCase(chr)){
            System.out.println(Character.toUpperCase(chr));
        }else{
            System.out.println(chr);
        }



















    }
}
