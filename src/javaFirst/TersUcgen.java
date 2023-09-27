package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int basamakSayisi=0;

        while (basamakSayisi<=0){
            System.out.print(" Basamak Sayisini Giriniz.");
            basamakSayisi = ipt.nextInt();
            if(basamakSayisi<=0){
                System.out.println("0'dan büyük bir sayi giriniz. ");
            }
        }
        /*
        for(int i =0;i<basamakSayisi;i++ ){

            for(int z =1; z< i+1;z++){
                System.out.print(" ");
            }
            for(int k =1; k<=(2*basamakSayisi-1)-2*i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }*/

        for(int a=1; a<=basamakSayisi;a++){
            for(int b=1; b<=a;b++ ) {
                System.out.print(" ");
            }
            for(int c=1;c<= (2*basamakSayisi+1)-(2*a);c++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
