package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /**
         * @author Orçin Özdemir, 2023
         */


        /*
        System.out.println("Sie ");
        System.out.println("Başla");
        System.out.println("Java101\nPatikası");
        System.out.println("Java101\tPatikası\b\bBaşlıyor");
        System.out.println("Java101\'de");
        System.out.println("Java101\'de \"Dersleri\"");

         */
        /*
        char vChar = 'b';
        char v2Char = 98;
        char c1 = 'J';
        char c2 = 'A';
        char c3 = 'V';
        char c4 = 'A';
        String vStr = " Hey Dost ";
        System.out.println(" "+c1+c2+c3+c4);
         System.out.println(vStr);
        */


        int a;
        Scanner veri1 = new Scanner(System.in);

        System.out.print("Bir A değeri Giriniz : ");
        //a = veri1.nextInt();
        //System.out.println(a);
        String vStr = veri1.nextLine();
        System.out.println(vStr);

    }
}
