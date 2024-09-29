package hesapMakinası;

import java.util.Scanner;

public class hesapMakinası {
    public static void main(String[] args) {


        Scanner hesap = new Scanner(System.in);
        System.out.println("iki adet sayı giriniz");

        double sayı1 = hesap.nextDouble();
        double sayı2 = hesap.nextDouble();


        System.out.println("İşlem operatorunü giriniz : (+, -, *, /) " );

        //+,-,*,/

        //String operatör = hesap.nextLine();
        double sonuc = 0;
        char operatör1 = hesap.next().charAt(0);

        switch (operatör1){
            case '+':
                sonuc = sayı1 +sayı2;
                break;
            case  '-':
                sonuc = sayı1 - sayı2;
                break;
            case  '*':
                sonuc = sayı1* sayı2;
                break;
            case  '/':
                sonuc = sayı1/ sayı2;
                break;
        }
        System.out.println(sayı1 + " " + operatör1 + " " + sayı2 + " = " + sonuc);

















    }
}
