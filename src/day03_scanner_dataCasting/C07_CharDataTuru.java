package day03_scanner_dataCasting;

import java.util.Scanner;

public class C07_CharDataTuru {
    public static void main(String[] args) {



        //kullanicidan bir karatekter isteyin, kullanicinin girdiği karakterden sonraki 3 karakteri yazdirin
        //örnek: input ; l ,  output; m,n,o


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir karekter giriniz: ");
        char girilenKarakter= scanner.next().charAt(0);
        System.out.println("girilen karakter: " + girilenKarakter +
                "sonraki 3 harf:"+ (char)(girilenKarakter+1)+" " +  (char)(girilenKarakter+2)  + " "+ (char)  (girilenKarakter+3));





    }
}
