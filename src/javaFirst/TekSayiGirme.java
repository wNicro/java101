package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class TekSayiGirme {
    public static void main(String[] args) {
        int k;
        int toplam =0;
        boolean ctrl=false;
        Scanner ipt = new Scanner(System.in);

        do {
            System.out.print("Bir Tek Sayi Değeri Giriniz.");
            k = ipt.nextInt();
            if(k%2==0 || k%4==0) toplam = toplam + k;
            if(k%2==1) ctrl = true;
        }while(ctrl!=true);

        System.out.println("Girilen Sayiların Toplamı = "+toplam);
    }
}
