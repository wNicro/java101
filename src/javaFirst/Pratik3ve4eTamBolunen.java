package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Pratik3ve4eTamBolunen {
    public static void main(String[] args) {
        int k=0;
        int toplam=0;
        int adet=0;
        Scanner ipt = new Scanner(System.in);
        System.out.print( " Bir Sayi Giriniz : ");
        k = ipt.nextInt();

        for(int i=0;i<=k;i++){
            if(i==0)continue;
            if(i%3==0 && i%4==0){
                toplam += i;
                adet++;
                //System.out.println(i);
            }
        }
        System.out.println("Girilen Sayinin 3 ve 4'e Bölünenlerin Ortalaması : "+ (toplam/adet));

    }
}
