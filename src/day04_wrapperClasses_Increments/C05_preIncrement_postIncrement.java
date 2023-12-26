package day04_wrapperClasses_Increments;

public class C05_preIncrement_postIncrement {
    public static void main(String[] args) {



        int a = 10;
        a++;

        System.out.println(a);

        a=10;
        ++a;
        System.out.println(a);


            // sayi = sayi +1 , sayi +=1; , sayi++;    ---> 3 farklı şekilde variable atama.




        int b =10;
        System.out.println("++b yazdigimda konsolda yazdirilan: " + ++b); //11
        System.out.println("++b'den 1 satir sonra b: " + b);//11


        int c =10;
        System.out.println("c++ yazdigimda konsolda yazdirilan: " + c++); //10
        System.out.println("c++'den 1 satir sonra b: " + c); //11

        // '++c' olursa önce arttırıp sonra yazdırır yani konsola 11 yazdırır
        // 'c++' olursa önce yazdırır sonra arttırır yani konsola 10 yazdırır , sonra 1 arttırı, 11 olur.












    }
}
