package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_scanner {
    public static void main(String[] args) {

        //Kullanicidan bir çemberin yariçapını alıp, çevresini ve alanini yazdirin




        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen yarıçapı giriniz: ");
        double yariCap=scanner.nextDouble();
        double cevre= yariCap * 2 * 3.14;
        double alan = yariCap * yariCap * 3.14;
        System.out.println(cevre);
        System.out.println(alan);








    }
}
