import java.sql.SQLOutput;
import java.util.Scanner;
public class Odev2 {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18,kdvliTutar;
        Scanner ipt = new Scanner(System.in);
        System.out.print(" Ücret Tutarını Giriniz : ");
        tutar = ipt.nextDouble();

        Boolean not = tutar >1000;
        kdvOran = not ? 0.08 : 0.18;
        kdvliTutar =tutar  + (tutar*kdvOran);
        System.out.println(" Kdv'siz Fiyat : "+ tutar);
        System.out.println(" KDV'li Fiyat : "+kdvliTutar);
        System.out.println(" KDV Tutarı : "+(kdvliTutar*kdvOran));
        System.out.println(" KDV Oranı : "+kdvOran);
    }
}
