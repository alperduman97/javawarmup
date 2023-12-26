package day02_dataTurleri_Scanner;

public class C02_NonPrimitiveDataTürleri {

    public static void main(String[] args) {


        String str = "java Candir";

        System.out.println(str.toLowerCase()); // java candir
        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str.charAt(0)); //J
        System.out.println(str.charAt(5)); // C

        System.out.println(str.substring(3));

        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase());
        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1,5).toUpperCase()+str.substring(5).toLowerCase());

    }
}
