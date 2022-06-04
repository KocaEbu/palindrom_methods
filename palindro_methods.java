import java.util.Scanner;

public class palindro_methods {
    static boolean isPalindrom(int number) {

        int temp = number, reversenumber = 0, lastnumber;

        while (temp != 0) {

            //System.out.println("==============");
            //System.out.println("Sayi =>" + temp);
            lastnumber = temp % 10;
            //System.out.println("Son Basamak =>" + lastnumber);
            reversenumber = (reversenumber * 10) + lastnumber;
            //System.out.println("Yeni sayi => " + reversenumber);
            temp /= 10;

        }
        if (number == reversenumber) return true;

        else
            return false;
    }



    public static void main(String[] args) {

       System.out.println( isPalindrom(1441)) ;


    }
}
