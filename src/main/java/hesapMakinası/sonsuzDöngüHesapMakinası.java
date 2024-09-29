package hesapMakinası;

import java.util.Scanner;

public class sonsuzDöngüHesapMakinası {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Islem yapılacak sayıları giriniz.");

            double sayi1=scan.nextDouble();
            double sayi2=scan.nextDouble();

            System.out.println("Islem operatorunu giriniz. '+'  '-'  '*'  '/' ");
            char operator = scan.next().charAt(0);
            double sonuc = 0;
            switch (operator)
            {
                case '+': sonuc=sayi1+sayi2;break;
                case '-': sonuc=sayi1-sayi2;break;
                case '*': sonuc=sayi1*sayi2;break;
                case '/': sonuc=sayi1/sayi2;break;
            }System.out.println(sonuc);
            continue;

        }while (true);
    }
}
