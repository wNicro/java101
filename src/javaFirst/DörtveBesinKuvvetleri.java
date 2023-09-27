package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class DörtveBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int n;
        System.out.print("Bir Sayi Giriniz : ");
        n = ipt.nextInt();


        for (int i = 1; i <= n; i++) {
            int powerOf4 = (int) Math.pow(4, i);
            int powerOf5 = (int) Math.pow(5, i);

            if (powerOf4 <= n) {
                System.out.println("4^" + i + " = " + powerOf4);
            }

            if (powerOf5 <= n) {
                System.out.println("5^" + i + " = " + powerOf5);
            }
        }

    }
}
