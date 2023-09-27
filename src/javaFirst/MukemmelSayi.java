package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner ipt = new Scanner(System.in);
        System.out.print(" Sayi Giriniz :");
        int a = ipt.nextInt();

        int b=0;
        for(int i=1; i<a;i++){
            if(a % i == 0){b+=i;}
        }
        if(b == a){
            System.out.print(a+" Sayısı Mükemmel Sayıdır ! ");
        }else{
            System.out.print(a+" Sayısı Mükemmel Sayı Değildir ! ");
        }
    }
}
