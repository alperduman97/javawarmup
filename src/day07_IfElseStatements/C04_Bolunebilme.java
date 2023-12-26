package day07_IfElseStatements;

import java.util.Scanner;

public class C04_Bolunebilme {
    public static void main(String[] args) {

        //kullanicidan pozitif bir tam sayi alın,
        //3 ile bölünebiliyorsa 3'ün katı
        //5 ile tam bölünebiliyorsa 5'in katı
        //ikisine de bölünebiliyorsa "super sayı" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tam bir sayı giriniz: ");
        int sayi=scanner.nextInt();



        if (sayi % 3 == 0 && sayi % 5 == 0){
            System.err.println("Girilen sayi süper sayıdır");
        } else if (sayi % 5 == 0) {
            System.err.println("Girilen sayi 5'in katıdır");
        }else if (sayi % 3==0 ){
            System.out.println("Girilen sayi 3'in katıdır!");
        }else {
            System.out.println("hatalı giriş digga!");
        }
















    }
}
