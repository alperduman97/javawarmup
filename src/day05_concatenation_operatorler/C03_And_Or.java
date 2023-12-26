package day05_concatenation_operatorler;

import java.util.Scanner;

public class C03_And_Or {
    public static void main(String[] args) {


        //kullanıcıdan not isteyin
        //girilen not 0 ile 100 arasında ise true
        // değilse false yazdırın
        //0 ve 100 dahil



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir not giriniz: ");
        double girilenNot=scanner.nextDouble();

        if (girilenNot >= 0 && girilenNot <= 100 ) { System.out.println("Girilen Not :"+ girilenNot);}

        else{System.out.println("Lütfen 0-100 arasında bir not giriniz!"); }



                    //not 50(dahil) ile 80(dahil) arasında degilse true, arasında ise false yazdirin

        if (!(girilenNot >=50 && girilenNot<= 80)){System.out.println("true");}
            else{System.out.println("false");}




























    }
}
