package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil,a;

        Scanner ipt = new Scanner(System.in);

        System.out.print("Yil Giriniz :  ");
        yil = ipt.nextInt();

        if((yil % 100)==0){
            if((yil % 400)==0){a=1;}
            else              {a=0;}
        }else {
            if((yil % 4)==0){a=1;}
            else            {a=0;}
        }

        if(a==1){
            System.out.println(yil+" bir artik yildir !");
        }else{
            System.out.println(yil+" bir artik yıl değildir !");
        }
    }
}
