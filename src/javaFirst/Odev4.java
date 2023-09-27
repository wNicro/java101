package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Odev4 {
    public static void main(String[] args) {
        double odenecekTutar;
        int gidilenKM;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM Cinsinden yazınız :");

        gidilenKM = input.nextInt();

        odenecekTutar = 10 +  gidilenKM*2.20;

        double sonuc =  (odenecekTutar>20) ? odenecekTutar : 20;
        System.out.println( " Ödeyeceğiiz Tutar : "+sonuc);
    }
}
