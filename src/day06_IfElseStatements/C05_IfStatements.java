package day06_IfElseStatements;

import java.util.Scanner;

public class C05_IfStatements {

    public static void main(String[] args) {



        //kullanicidan bir üçgenin 3 kenar uzunluğunu alin
        // ucgen eskenar ise "eskenar ucgen" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin 3 kenar uzunluğunu girin: ");
        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0 ){

            System.out.println("eşkenar üçgen");
        }




















    }
}
