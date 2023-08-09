import java.sql.SQLOutput;
import java.util.Scanner;
public class Odev1 {
    public static void main(String[] args){

        int mat, fizik,kimya, turkce,tarih,muzik ;
        // Scaner sıfımızı tanımladık.
        Scanner inp = new Scanner(System.in);

        //Kullanıcan verileri alıcaz.
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz :");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        Boolean not = sonuc >60;
        String a =  not ? "Geçtiniz" :"Kaldınız";
   // no1


        System.out.println( a );
    }
}
