package day07_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {


        //kullanicidan bir karakter girmesini isteyin, girilen karakterin büyük harf olup olmadiğini yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz: ");
        char chr=scanner.next().charAt(0);

        if (chr >= 'A' && chr <= 'Z'){System.out.println("Girilen karakter büyük harftir");}
        else{System.out.println("Girilen karakter küçük harftir");}

























    }
}
