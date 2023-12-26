package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {


        //Kullanicidan ismini, soyismini ve yasini alip aşagidaki gibi yazdirin
        // girilen Bilgiler: J Doe, 44



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz: ");
        String isim= scanner.nextLine();
        System.out.println("Lütfen Soyisminizi giriniz: ");
        String soyIsim = scanner.nextLine();
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("Girilen Bilgiler: "+ isim.toUpperCase().charAt(0)+ " "+
                soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase()
                +", " +yas);









    }
}
