package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin

    //isminiz: John
    //soyisminiz: Doe
    //yasiniz: 44
    //kaydiniz başarılı bir şekilde tamamlandı.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz: ");
        String girilenIsim=scanner.nextLine();
        System.out.println("Lütfen soyisminizi giriniz: ");
        String girilenSoyisim=scanner.nextLine();
        System.out.println("Lütfen yaşınızı giriniz: ");
        int girilenYas=scanner.nextInt();
        System.out.println("İsminiz:"+girilenIsim+ "\n " +"Soyisminiz: "+girilenSoyisim+ "\n "+
                "Yaşınız: " + girilenYas+ "\n " + "Kaydınız başarılı bir şekilde kaydedildi!");



    }
}
