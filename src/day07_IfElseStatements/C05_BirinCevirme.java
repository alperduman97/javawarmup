package day07_IfElseStatements;

import java.util.Scanner;

public class C05_BirinCevirme {

    public static void main(String[] args) {

        //kullanicidan mesafeyi kilometere olarak alın
        // çevirmek istediği birimi sorun
        //istediği birim metre veya santimetre ise cevirip yazdirin
        //yoksa istediğiniz birim sisteme kayıtlı değil yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen mesafeyi kilometre cinsinden giriniz: ");
        double kilometre= scanner.nextDouble();
        System.out.println("Lütfen çevrimek istediğiniz birimi yazın: ");
        String istenilenBirim = scanner.next();

        double metreCevirme = kilometre*1000;
        double CantimetreCevirme = kilometre*100000;

        if (istenilenBirim.equalsIgnoreCase("metre")){
            System.out.println("Metre karşılığı: " +metreCevirme);
        } else if (istenilenBirim.equalsIgnoreCase("santimetre")) {
            System.out.println("Cm karşılığı: " +CantimetreCevirme);
        }else {
            System.out.println("Doğru değer giriniz!");
        }


    }
}
