package javaFirst;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Faktoriel {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int n,r,d1=1,d2=1,d3=1;
        System.out.print(" Kombinasyonun N değeri Giriniz : ");
        n = ipt.nextInt();
        System.out.print(" Kombinasyonun r değerini Giriniz : ");
        r = ipt.nextInt();

        if (n < r) {
            System.out.println("Hatalı giriş: n, r'den büyük olmalıdır.");
            return;
        }

        // C(n,r) = n! / (r! * (n-r)!)
        long kombinasyon = kombinasyonHesapla(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);



    }
    // Kombinasyon hesaplama işlemi için bir metot
    public static long kombinasyonHesapla(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else {
            return faktoriyelHesapla(n) / (faktoriyelHesapla(r) * faktoriyelHesapla(n - r));
        }
    }
    // Faktöriyel hesaplama işlemi için bir metot
    public static long faktoriyelHesapla(int sayi) {
        long faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
