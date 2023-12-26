package day06_IfElseStatements;

import java.util.Scanner;

public class C04_AyIsmiYazdirma {
    public static void main(String[] args) {



//kullanicidan bir harf alin,
        //harf ile  başlayan ay varsa yazdirin
        //büyük küçük harf ayrımı olmasın,
        //kullanici o ve ya büyük O yazdığında output Ocak olsun


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf = scanner.next().charAt(0);
        int flag=0;

        if (harf == 'o' || harf == 'O' ){
            System.out.println("OCAK");
            flag++;
        }

        if (harf == 'ş' || harf == 'Ş' ){
            System.out.println("ŞUBAT");
            flag++;
        }

        if (harf == 'm' || harf == 'M' ){
            System.out.println("MART ve MAYIS");
            flag++;
        }

        if (harf == 'n' || harf == 'N' ){
            System.out.println("Nisan");
            flag++;
        }

        if (harf == 'h' || harf == 'H' ){

            flag++;    System.out.println("HAZİRAN");
        }

        if (harf == 't' || harf == 'T' ){
            System.out.println("TEMMUZ");
            flag++;
        }

        if (harf == 'a' || harf == 'A' ){
            System.out.println("AĞUSTOS veya ARALIK");
            flag++;
        }

        if (harf == 'e' || harf =='E' ){
            System.out.println("EYLÜL veya EKİM");
            flag++;
        }

        if (harf == 'k' || harf == 'K' ){
            System.out.println("KASIM");
            flag++;
        }if (flag == 0){
            System.out.println("Girdiğiniz harf ile başlayan ay yok kirve!");
        }











    }
}
